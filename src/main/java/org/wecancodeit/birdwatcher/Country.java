package org.wecancodeit.birdwatcher;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @OneToMany(mappedBy = "country")
    @JsonIgnore
    private Collection<Bird> birds;
//    //potential for deletion below
//    @ManyToMany(mappedBy = "habitats")
//    private Collection<Habitat> Habitats;
//    //potential for deletion below
//    @ManyToMany(mappedBy = "birds")
//    private Collection<Bird> Birds;
//    //potential for deletion above

    //Peru has Coast, Mountains, Jungles. Ecuador has Coast, Mountains, Jungles

    public Country(String location){

    }

    public Country(String location, String urlImage) {
        this.location = location;
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


    public Collection<Bird> getBirds() {
        return birds;

    }

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", location='" + location + '\'' + '}';
    }
}
