package net.usachev.autoschedule.repository;

import net.usachev.autoschedule.model.Departure;

import java.time.LocalDateTime;
import java.util.Collection;

public interface DepartureRepository {
    Departure save(Departure departure, int userId);

    boolean delete(int id, int userId);

    Departure get(int id, int userId);

    Collection<Departure> getAll(int userId);

    Collection<Departure> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);
}
