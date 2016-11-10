package net.usachev.autoschedule.controller.user;

import net.usachev.autoschedule.AuthorizedUser;
import net.usachev.autoschedule.domain.User;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileRestController extends AbstractUserController {

    public User get() {
        return super.get(AuthorizedUser.id());
    }

    public void delete() {
        super.delete(AuthorizedUser.id());
    }

    public void update(User user) {
        super.update(user, AuthorizedUser.id());
    }
}
