package org.wecancodeit.birdwatcher;

import org.wecancodeit.birdwatcher.Bird;
import org.wecancodeit.birdwatcher.Region;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Habitat {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    @OneToMany(mappedBy = "habitat")
    private Collection<Bird> birds;

    public Habitat(){

    }

    public Habitat(String name, String description, String imageUrl, Bird...birds) {
        this.name=name;
        this.description=description;
        this.imageUrl=imageUrl;
        this.birds = new ArrayList<>(Arrays.asList(birds));
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }


    public Collection<Bird> getBirds() {
        return birds;

    }

    @Override
    public String toString() {
        return "Habitat{" +
                "Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                '}';
    }

}



