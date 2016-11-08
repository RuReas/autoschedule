package net.usachev.autoschedule.repository;

import net.usachev.autoschedule.domain.Departure;

import java.util.Collection;

public interface DepartureRepository {
    Departure save(Departure departure);

    void delete(int id);

    Departure get(int id);

    Collection<Departure> getAll();
}
