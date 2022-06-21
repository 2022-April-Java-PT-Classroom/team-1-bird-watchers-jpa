package org.wecancodeit.birdwatcher;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


@Entity
public class Region {
    @Id
    @GeneratedValue
    private Long id;
    private String regionName;
    @OneToMany(mappedBy = "region")
    private Collection<Bird> birds;

    public Region(String regionName, Bird...birds) {
        this.regionName = regionName;
        this.birds = new ArrayList<>(Arrays.asList(birds));
    }

    public Region() {
    }

    public String getRegionName() {
        return regionName;
    }

    public Long getId() {
        return id;
    }

    public Collection<Bird> getBirds() {
        return birds;

    }



}
