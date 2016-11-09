package net.usachev.autoschedule.web.user;

import net.usachev.autoschedule.domain.User;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AdminRestController extends AbstractUserController {

    public List<User> getAll() {
        return super.getAll();
    }

    public User get(int id) {
        return super.get(id);
    }

    public User create(User user) {
        return super.create(user);
    }

    public void delete(int id) {
        super.delete(id);
    }

    public void update(User user, int id) {
        super.update(user, id);
    }

    public User getByMail(String email) {
        return super.getByMail(email);
    }
}
