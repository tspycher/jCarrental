package com.tspycher.jcarrental.entity;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractEntity {
    protected static final long serialVersionUID = 1L;
    
    @Version
	@Access(AccessType.FIELD)
	private long version;
    
    protected Date created;
    protected Date updated;
    
    /**
     * @return the created
     */
    @Column(name="created")
    @Temporal(TemporalType.DATE)
    public Date getCreated() {
            return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(Date created) {
            this.created = created;
    }

    /**
     * @return the updated
     */
    @Column(name="updated")
    @Temporal(TemporalType.DATE)
    public Date getUpdated() {
            return updated;
    }

    /**
     * @param updated the updated to set
     */
    public void setUpdated(Date updated) {
            this.updated = updated;
    }

    @PrePersist
    protected void setDate() {
            this.created = new Date();
            this.updated = new Date();
    }
}