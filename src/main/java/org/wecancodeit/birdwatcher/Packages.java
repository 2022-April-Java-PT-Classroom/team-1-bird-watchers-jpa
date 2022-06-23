package org.wecancodeit.birdwatcher;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Packages {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;

}
