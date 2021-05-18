package com.libratic.rest.libratic.pojos;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Publishers extends IdName {

    @ManyToMany(mappedBy = "publishers")
    private Set<Book> books;

    public Publishers() {
    }

    public Set<Book> getBooks() {
        return this.books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

}
