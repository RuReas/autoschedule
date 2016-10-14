package net.usachev.autoschedule.model;

import java.time.LocalDateTime;

public class Departure extends BaseEntity {
    private User user;
    private Transport transport;
    private LocalDateTime start;
    private LocalDateTime end;
}
