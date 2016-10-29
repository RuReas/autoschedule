package net.usachev.autoschedule.model;

import java.util.List;

public class Transport extends NamedEntity {
    private String model;

    protected List<Departure> departures;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public List<Departure> getDepartures() {
        return departures;
    }
}
