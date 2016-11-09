package net.usachev.autoschedule.web.user;

import net.usachev.autoschedule.AuthorizedUser;
import net.usachev.autoschedule.domain.User;

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
