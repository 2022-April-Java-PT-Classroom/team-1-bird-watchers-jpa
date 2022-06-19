package org.wecancodeit.birdwatcher;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    private String description;
    private String urlImage;
    @ManyToMany (mappedBy = "countries")
    private Collection<Region> regions;

    //I feel strongly about writing out continent. But maybe we don't need it.
    //Peru has Coast, Mountains, Jungles. Ecuador has Coast, Mountains, Jungles.

    public Country(String location){

    }

    public Country(String location, String description, String urlImage, Region... regions) {
        this.location = location;
        this.description = description;
        this.urlImage = urlImage;
        this.regions = Arrays.asList(regions);
    }

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }


    public String getUrlImage(){
        return urlImage;
    }

    public String getDescription(){
        return description;
    }

    public Collection<Region> getRegions(){
        return regions;

    }

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", location='" + location + ", description='" + description + ", urlImage='" + urlImage + '\'' + '}';
    }

}
