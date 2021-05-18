package com.libratic.rest.libratic.pojos;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;

@Entity
public class Cast extends IdName {

    //many to many
    private Map<Item,List<String>> items;

    public Cast() {
    }

    public Map<Item,List<String>> getCast() {
        return this.items;
    }

    public void setCast(Map<Item,List<String>> items) {
        this.items = items;
    }

}
