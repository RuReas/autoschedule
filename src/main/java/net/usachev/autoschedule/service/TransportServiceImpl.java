package net.usachev.autoschedule.service;

import net.usachev.autoschedule.repository.TransportRepository;
import org.springframework.stereotype.Service;

@Service
public class TransportServiceImpl implements TransportService {

    private TransportRepository repository;
}
