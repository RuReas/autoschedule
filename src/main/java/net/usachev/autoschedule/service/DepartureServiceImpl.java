package net.usachev.autoschedule.service;

import net.usachev.autoschedule.repository.DepartureRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartureServiceImpl implements DepartureService {
    private DepartureRepository repository;
}
