package net.usachev.autoschedule.repository.mock;

import net.usachev.autoschedule.domain.Departure;
import net.usachev.autoschedule.repository.DepartureRepository;
import net.usachev.autoschedule.util.MockData;
import org.slf4j.Logger;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import static org.slf4j.LoggerFactory.getLogger;

public class InMemoryDepartureRepositoryImpl implements DepartureRepository {

    private static final Logger LOG = getLogger(InMemoryDepartureRepositoryImpl.class);

    private Map<Integer, Departure> repository = new ConcurrentHashMap<>();

    private AtomicInteger counter = new AtomicInteger(0);

    {
        LOG.info("create mock DEPARTURES");
        MockData.DEPARTURES.forEach(this::save);
    }

    @Override
    public Departure save(Departure departure) {
        LOG.info("save " + departure);
        if (departure.isNew()) {
            departure.setId(counter.incrementAndGet());
        }
        repository.put(departure.getId(), departure);
        return departure;
    }

    @Override
    public void delete(int id) {
        LOG.info("delete " + id);
        repository.remove(id);
    }

    @Override
    public Departure get(int id) {
        LOG.info("get " + id);
        return repository.get(id);
    }

    @Override
    public Collection<Departure> getAll() {
        LOG.info("getAll");
        return repository.values();
    }
}

