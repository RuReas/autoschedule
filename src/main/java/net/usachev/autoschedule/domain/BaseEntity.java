package net.usachev.autoschedule.domain;

public class BaseEntity {
    protected Integer id;

    BaseEntity() {
    }

    BaseEntity(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public boolean isNew() {
        return (getId() == null);
    }
}