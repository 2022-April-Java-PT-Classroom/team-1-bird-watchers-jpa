package org.wecancodeit.birdwatcher;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "country")
    private Collection<Region> regions;

    public Country(){

    }

    public Country(String name, String description, Region...regions) {
        this.name=name;
        this.description=description;
        this.regions = new ArrayList<>(Arrays.asList(regions));
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


    public Collection<Region> getRegions() {
        return regions;

    }

    @Override
    public String toString() {
        return "Country{" +
                "Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                '}';
    }

}
