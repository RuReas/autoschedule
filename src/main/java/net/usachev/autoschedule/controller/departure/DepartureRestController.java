package net.usachev.autoschedule.controller.departure;

import net.usachev.autoschedule.service.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DepartureRestController {

    @Autowired
    private DepartureService service;
}
