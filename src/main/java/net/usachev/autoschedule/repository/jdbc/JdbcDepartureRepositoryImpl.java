package net.usachev.autoschedule.repository.jdbc;

import net.usachev.autoschedule.domain.Departure;
import net.usachev.autoschedule.repository.DepartureRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class JdbcDepartureRepositoryImpl implements DepartureRepository{

    @Override
    public Departure save(Departure departure) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Departure get(int id) {
        return null;
    }

    @Override
    public Collection<Departure> getAll() {
        return null;
    }
}
