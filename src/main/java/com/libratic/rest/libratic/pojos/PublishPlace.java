package com.libratic.rest.libratic.pojos;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class PublishPlace extends IdName {
    
    @ManyToMany(mappedBy = "publishPlaces")
    private Set<Book> books;

    public PublishPlace() {
    }

    public Set<Book> getBooks() {
        return this.books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

}
