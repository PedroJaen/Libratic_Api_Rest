package com.libratic.rest.libratic.pojos;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Subject extends IdName {

    @ManyToMany(mappedBy = "subjects")
    private Set<Book> books;

    public Subject() {
    }

    public Set<Book> getBooks() {
        return this.books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

}
