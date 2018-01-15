package sk.jazzman.buildingintelli.domain;

import java.sql.Timestamp;

/**
 * All objects are It
 */
public abstract class It {
    private final Long id;
    private Object createdBy;
    private Timestamp createdOn;

    @Id
    public It(Long id){
        this.id = id;
        createdBy = null;
        createdOn = null;
    }


    public Long getId() {
        return id;
    }

    public Object getCreatedBy() {
        return createdBy;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }
}
