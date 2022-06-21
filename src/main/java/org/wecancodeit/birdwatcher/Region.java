package org.wecancodeit.birdwatcher;

<<<<<<< HEAD
import javax.persistence.Entity;

@Entity
public class Region {

=======
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Region {
    @Id
    @GeneratedValue
    private Long id;
    private String regionName;

    @OneToMany(mappedBy = "region")
    @JsonIgnore
    private Collection<Bird> birdsCollections;

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
>>>>>>> main


}
