package net.usachev.autoschedule.repository.mock;

import net.usachev.autoschedule.domain.User;
import net.usachev.autoschedule.repository.UserRepository;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@Repository
public class MockUserRepositoryImpl implements UserRepository {

    private static final Logger LOG = getLogger(MockUserRepositoryImpl.class);

    @Override
    public boolean delete(int id) {
        LOG.info("delete " + id);
        return true;
    }

    @Override
    public User save(User user) {
        LOG.info("save " + user);
        return user;
    }

    @Override
    public User get(int id) {
        LOG.info("get " + id);
        return null;
    }

    @Override
    public List<User> getAll() {
        LOG.info("getAll");
        return Collections.emptyList();
    }

    @Override
    public User getByEmail(String email) {
        LOG.info("getByEmail " + email);
        return null;
    }
}
