package net.usachev.autoschedule.repository;

import net.usachev.autoschedule.domain.User;

import java.util.List;

public interface UserRepository {
    User save(User user);

    boolean delete(int id);

    User get(int id);

    User getByEmail(String email);

    List<User> getAll();
}
