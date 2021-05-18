package com.libratic.rest.libratic.pojos;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Book extends Item{
    private String cover;

    private String isbn;

    private int nPages;

    private Date publishDate;

    @ManyToMany
    @JoinTable(name = "book_authors", 
        joinColumns = @JoinColumn(name = "book_id"), 
        inverseJoinColumns = @JoinColumn(name = "authors_id"))
    private Set<Author> authors;

    @ManyToMany
    @JoinTable(name = "book_publishPlaces", 
        joinColumns = @JoinColumn(name = "book_id"), 
        inverseJoinColumns = @JoinColumn(name = "publishPlaces_id"))
    private Set<PublishPlace> publishPlaces;

    @ManyToMany
    @JoinTable(name = "book_publishers", 
        joinColumns = @JoinColumn(name = "book_id"), 
        inverseJoinColumns = @JoinColumn(name = "publishers_id"))
    private Set<Publishers> publishers;

    @ManyToMany
    @JoinTable(name = "book_subjects", 
        joinColumns = @JoinColumn(name = "book_id"), 
        inverseJoinColumns = @JoinColumn(name = "subjects_id"))
    private Set<Subject> subjects;

    public Book() {
    }

    public String getCover() {
        return this.cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNPages() {
        return this.nPages;
    }

    public void setNPages(int nPages) {
        this.nPages = nPages;
    }

    public Date getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Set<Author> getAuthors() {
        return this.authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Set<PublishPlace> getPublishPlaces() {
        return this.publishPlaces;
    }

    public void setPublishPlaces(Set<PublishPlace> publishPlaces) {
        this.publishPlaces = publishPlaces;
    }

    public Set<Publishers> getPublishers() {
        return this.publishers;
    }

    public void setPublishers(Set<Publishers> publishers) {
        this.publishers = publishers;
    }

    public Set<Subject> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

}
