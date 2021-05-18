package com.libratic.rest.libratic.pojos;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Genre extends IdName {

    @ManyToMany(mappedBy = "genres")
    private Set<Item> items;
    
    public Genre() {
    }

    public Set<Item> getItems() {
        return this.items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }


}
