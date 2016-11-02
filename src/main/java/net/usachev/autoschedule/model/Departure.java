package net.usachev.autoschedule.model;

import java.time.LocalDateTime;

public class Departure extends BaseEntity {
/*  TODO
    private User user;
    private Transport transport;
*/
    private String description;
    private LocalDateTime start;
    private LocalDateTime end;

    public Departure(String description, LocalDateTime start, LocalDateTime end) {
        this(null, description, start, end);
    }

    public Departure(Integer id, String description, LocalDateTime start, LocalDateTime end) {
        super(id);
        this.description = description;
        this.start = start;
        this.end = end;
    }

/*  TODO
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
*/

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
