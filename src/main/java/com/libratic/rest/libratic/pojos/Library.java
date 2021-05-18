package com.libratic.rest.libratic.pojos;

import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Library extends IdName {

    private String adress;

    private String city;

    private String email;

    private String phone;

    private String picture;

    //many to one
    private Set<User> users;

    //many to one
    private Map<Item,Integer> items;

    //many to one
    private Set<Item> wished;


    public Library() {
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Set<User> getUsers() {
        return this.users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Map<Item,Integer> getItems() {
        return this.items;
    }

    public void setItems(Map<Item,Integer> items) {
        this.items = items;
    }

    public Set<Item> getWished() {
        return this.wished;
    }

    public void setWished(Set<Item> wished) {
        this.wished = wished;
    }

}
