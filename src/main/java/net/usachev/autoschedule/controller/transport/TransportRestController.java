package net.usachev.autoschedule.controller.transport;

import net.usachev.autoschedule.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TransportRestController {

    @Autowired
    private TransportService service;
}
