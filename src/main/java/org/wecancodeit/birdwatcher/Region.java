package org.wecancodeit.birdwatcher;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Region {
    @Id
    @GeneratedValue
    private Long id;
    private String regionName;

    public Region(String regionName){

    }
}
