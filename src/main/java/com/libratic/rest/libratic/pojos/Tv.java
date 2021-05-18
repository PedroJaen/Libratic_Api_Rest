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
public class Tv extends Item {

    private Date firstAirDate;

    private String homePage;

    private String overView;

    private int episodes;

    private int seasons;

    private String posterPath;

    @ManyToMany
    @JoinTable(name = "item_pCompany", 
        joinColumns = @JoinColumn(name = "item_id"), 
        inverseJoinColumns = @JoinColumn(name = "pCompany_id"))
    private Set<Item> pCompanies;

    // many to many
    private Map<Cast, List<String>> cast;

    @ManyToMany
    @JoinTable(name = "tv_creator", 
        joinColumns = @JoinColumn(name = "tv_id"), 
        inverseJoinColumns = @JoinColumn(name = "creator_id"))
    private Set<Creator> createdBy;

    // many to many
    private Map<Crew, List<String>> crew;

    @ManyToMany
    @JoinTable(name = "item_genres", 
        joinColumns = @JoinColumn(name = "item_id"), 
        inverseJoinColumns = @JoinColumn(name = "genres_id"))
    private Set<Item> genres;

    public Tv() {
    }

    public Date getFirstAirDate() {
        return this.firstAirDate;
    }

    public void setFirstAirDate(Date firstAirDate) {
        this.firstAirDate = firstAirDate;
    }

    public String getHomePage() {
        return this.homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getOverView() {
        return this.overView;
    }

    public void setOverView(String overView) {
        this.overView = overView;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getSeasons() {
        return this.seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public String getPosterPath() {
        return this.posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Set<Item> getPCompany() {
        return this.pCompanies;
    }

    public void setPCompany(Set<Item> pCompanies) {
        this.pCompanies = pCompanies;
    }

    public Map<Cast, List<String>> getCast() {
        return this.cast;
    }

    public void setCast(Map<Cast, List<String>> cast) {
        this.cast = cast;
    }

    public Set<Creator> getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Set<Creator> createdBy) {
        this.createdBy = createdBy;
    }

    public Map<Crew, List<String>> getCrew() {
        return this.crew;
    }

    public void setCrew(Map<Crew, List<String>> crew) {
        this.crew = crew;
    }

    public Set<Item> getGenres() {
        return this.genres;
    }

    public void setGenres(Set<Item> genres) {
        this.genres = genres;
    }

}
