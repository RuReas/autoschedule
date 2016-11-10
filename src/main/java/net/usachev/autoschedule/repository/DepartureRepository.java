package net.usachev.autoschedule.repository;

import net.usachev.autoschedule.domain.Departure;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface DepartureRepository {

    Departure save(Departure departure);

    void delete(int id);

    Departure get(int id);

    Collection<Departure> getAll();
}
