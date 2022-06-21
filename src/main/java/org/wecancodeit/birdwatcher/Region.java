package org.wecancodeit.birdwatcher;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Region {
    @Id
    @GeneratedValue
    private Long id;
    private String regionName;
    public Region(String regionName) {
        this.regionName = regionName;
    }

    public Region() {
    }

    public String getRegionName() {
        return regionName;
    }

    public Long getId() {
        return id;
    }


}
