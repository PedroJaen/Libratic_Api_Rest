package com.libratic.rest.libratic.pojos;

import java.util.Set;

import javax.persistence.Entity;

@Entity
public class User extends IdName {

    private String email;

    private String adress;

    private String city;

    private String dni;

    private String phone;

    private boolean punishment;

    // one to many
    private Level lvl;

    // onte to many
    private Library library;

    // many to many
    private Set<Item> wished;

    // many to many
    private Set<Item> favourites;

    // many to many
    private Set<Lending> lendings;

    public User() {
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isPunishment() {
        return this.punishment;
    }

    public boolean getPunishment() {
        return this.punishment;
    }

    public void setPunishment(boolean punishment) {
        this.punishment = punishment;
    }

    public Level getLvl() {
        return this.lvl;
    }

    public void setLvl(Level lvl) {
        this.lvl = lvl;
    }

    public Library getLibrary() {
        return this.library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Set<Item> getWished() {
        return this.wished;
    }

    public void setWished(Set<Item> wished) {
        this.wished = wished;
    }

    public Set<Item> getFavourites() {
        return this.favourites;
    }

    public void setFavourites(Set<Item> favourites) {
        this.favourites = favourites;
    }

    public Set<Lending> getLendings() {
        return this.lendings;
    }

    public void setLendings(Set<Lending> lendings) {
        this.lendings = lendings;
    }

}
