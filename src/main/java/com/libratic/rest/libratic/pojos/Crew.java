package com.libratic.rest.libratic.pojos;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;

@Entity
public class Crew extends IdName {
    
    // many to many
    private Map<Item, List<String>> items;

    public Crew() {
    }

    public Map<Item, List<String>> getItems() {
        return this.items;
    }

    public void setItems(Map<Item, List<String>> items) {
        this.items = items;
    }

}
