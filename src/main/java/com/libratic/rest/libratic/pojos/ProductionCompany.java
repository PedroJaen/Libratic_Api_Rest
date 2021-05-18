package com.libratic.rest.libratic.pojos;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class ProductionCompany extends IdName {
    
    @ManyToMany(mappedBy = "pCompanies")
    private Set<Item> shows;

    public ProductionCompany() {
    }

    public Set<Item> getShows() {
        return this.shows;
    }

    public void setShows(Set<Item> shows) {
        this.shows = shows;
    }

    
}
