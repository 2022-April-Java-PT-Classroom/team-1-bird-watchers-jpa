package org.wecancodeit.birdwatcher;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


@Entity
public class Region {
    @Id
    @GeneratedValue
    private Long id;
    private String regionName;
    @Lob
    private String description;
    @OneToMany(mappedBy = "region")
    private Collection<Bird> birds;

    public Region(String regionName, String description, Bird...birds) {
        this.regionName = regionName;
        this.description=description;
        this.birds = new ArrayList<>(Arrays.asList(birds));
    }

    public Region() {
    }

    public String getRegionName() {
        return regionName;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public Collection<Bird> getBirds() {
        return birds;

    }



}
