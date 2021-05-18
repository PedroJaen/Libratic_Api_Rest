package com.libratic.rest.libratic.pojos;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Creator extends IdName {

    @ManyToMany(mappedBy = "createdBy")
    private Set<Tv> shows;

    public Creator() {
    }


    public Set<Tv> getShows() {
        return this.shows;
    }

    public void setShows(Set<Tv> shows) {
        this.shows = shows;
    }


}
