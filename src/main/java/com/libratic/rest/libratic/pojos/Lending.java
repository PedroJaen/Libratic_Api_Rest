package com.libratic.rest.libratic.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lending {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //one to many
    private Item item;

    private boolean Active;

    private Date startDate;

    private Date endDate;

    private boolean late;


    public Lending() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isActive() {
        return this.Active;
    }

    public boolean getActive() {
        return this.Active;
    }

    public void setActive(boolean Active) {
        this.Active = Active;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isLate() {
        return this.late;
    }

    public boolean getLate() {
        return this.late;
    }

    public void setLate(boolean late) {
        this.late = late;
    }

}
