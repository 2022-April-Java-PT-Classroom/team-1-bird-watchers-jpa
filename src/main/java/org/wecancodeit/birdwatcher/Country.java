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
    private String urlImage;
    private String description;
    @OneToMany(mappedBy = "country")
    private Collection<Region> regions;
    @ManyToMany(mappedBy = "birds")
    private Collection<Habitat> Habitats;
    @ManyToMany
    private Collection<Bird> Birds;

    //Peru has Coast, Mountains, Jungles. Ecuador has Coast, Mountains, Jungles

    public Country(){

    }

    public Country(String location, String description, String urlImage, Region...regions) {
        this.location = location;
        this.description=description;
        this.regions = new ArrayList<>(Arrays.asList(regions));
    }

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getUrlImage(){
        return urlImage;
    }


    public Collection<Region> getRegions() {
        return regions;

    }

    @Override
    public String toString() {
        return "Country{" +
                "Location='" + location + '\'' +
                ", Description='" + description + '\'' +
                '}';
    }

}
