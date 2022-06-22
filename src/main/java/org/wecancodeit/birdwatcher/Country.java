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
    @Lob
    private String description;
    private String urlImage;
    @OneToMany(mappedBy = "country")
    private Collection<Bird> birds;


    public Country(){
    }

    public Country(String location, String description, String urlImage, Bird...birds) {
        this.location = location;
        this.description = description;
        this.urlImage = urlImage;
        this.birds = new ArrayList<>(Arrays.asList(birds));
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

    public Collection<Bird> getBirds() {
        return birds;

    }

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", location='" + location + '\'' + '}';
    }

}
