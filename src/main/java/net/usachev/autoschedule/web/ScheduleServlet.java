package net.usachev.autoschedule.web;

import net.usachev.autoschedule.domain.Departure;
import net.usachev.autoschedule.repository.DepartureRepository;
import net.usachev.autoschedule.repository.mock.InMemoryDepartureRepositoryImpl;
import org.slf4j.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Objects;

import static org.slf4j.LoggerFactory.getLogger;

public class ScheduleServlet extends HttpServlet {
    private static final Logger LOG = getLogger(ScheduleServlet.class);

    private DepartureRepository repository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        repository = new InMemoryDepartureRepositoryImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");

        Departure departure = new Departure(id.isEmpty() ? null : Integer.valueOf(id),
                request.getParameter("description"),
                LocalDateTime.parse(request.getParameter("start")),
                LocalDateTime.parse(request.getParameter("end")));

        LOG.info(departure.isNew() ? "Create {}" : "Update {}", departure);
        repository.save(departure);
        response.sendRedirect("schedule");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            LOG.info("getAll");
            request.setAttribute("schedule", repository.getAll());
            request.getRequestDispatcher("/schedule.jsp").forward(request, response);

        } else if ("delete".equals(action)) {
            int id = getId(request);
            LOG.info("Delete {}", id);
            repository.delete(id);
            response.sendRedirect("schedule");

        } else if ("create".equals(action) || "update".equals(action)) {
            final Departure departure = action.equals("create") ?
                    new Departure("", LocalDateTime.now().withNano(0).withSecond(0), LocalDateTime.now().withNano(0).withSecond(0)) :
                    repository.get(getId(request));
            request.setAttribute("departure", departure);
            request.getRequestDispatcher("departure.jsp").forward(request, response);
        }
    }

    private int getId(HttpServletRequest request) {
        String paramId = Objects.requireNonNull(request.getParameter("id"));
        return Integer.valueOf(paramId);
    }
}
