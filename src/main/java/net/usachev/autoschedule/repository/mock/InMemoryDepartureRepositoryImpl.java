package net.usachev.autoschedule.repository.mock;

import net.usachev.autoschedule.domain.Departure;
import net.usachev.autoschedule.repository.DepartureRepository;
import net.usachev.autoschedule.util.MockData;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryDepartureRepositoryImpl implements DepartureRepository {
    private Map<Integer, Departure> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        MockData.DEPARTURES.forEach(this::save);
    }

    @Override
    public Departure save(Departure departure) {
        if (departure.isNew()) {
            departure.setId(counter.incrementAndGet());
        }
        repository.put(departure.getId(), departure);
        return departure;
    }

    @Override
    public void delete(int id) {
        repository.remove(id);
    }

    @Override
    public Departure get(int id) {
        return repository.get(id);
    }

    @Override
    public Collection<Departure> getAll() {
        return repository.values();
    }
}

