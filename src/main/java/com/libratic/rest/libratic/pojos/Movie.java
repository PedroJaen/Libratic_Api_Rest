package com.libratic.rest.libratic.pojos;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Movie extends Item {
    
    private String homepage;

    private String overView;

    private String posterPath;

    private Date date;

    private int runtime;

    private String tagLine;

    //may to many
    private Map<Cast,List<String>> cast;

    //many to many
    private Map<Crew,List<String>> crew;

    @ManyToMany
    @JoinTable(name = "item_genres", 
        joinColumns = @JoinColumn(name = "item_id"), 
        inverseJoinColumns = @JoinColumn(name = "genres_id"))
    private Set<Item> genres;

    @ManyToMany
    @JoinTable(name = "item_pCompany", 
        joinColumns = @JoinColumn(name = "item_id"), 
        inverseJoinColumns = @JoinColumn(name = "pCompany_id"))
    private Set<Item> pCompanies;


    public Movie() {
    }

    public String getHomepage() {
        return this.homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getOverView() {
        return this.overView;
    }

    public void setOverView(String overView) {
        this.overView = overView;
    }

    public String getPosterPath() {
        return this.posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRuntime() {
        return this.runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getTagLine() {
        return this.tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public Set<Item> getGenres() {
        return this.genres;
    }

    public void setGenres(Set<Item> genres) {
        this.genres = genres;
    }

    public Set<Item> getPCompanies() {
        return this.pCompanies;
    }

    public void setPCompanies(Set<Item> pCompanies) {
        this.pCompanies = pCompanies;
    }

    public Map<Cast,List<String>> getCast() {
        return this.cast;
    }

    public void setCast(Map<Cast,List<String>> cast) {
        this.cast = cast;
    }

    public Map<Crew,List<String>> getCrew() {
        return this.crew;
    }

    public void setCrew(Map<Crew,List<String>> crew) {
        this.crew = crew;
    }
    

}
