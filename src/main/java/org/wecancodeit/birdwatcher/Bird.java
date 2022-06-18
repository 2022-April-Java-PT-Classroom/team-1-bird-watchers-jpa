package org.wecancodeit.birdwatcher;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bird {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    private String description;
    private String order;
    @ManyToOne
    private String country;
    private String region;
    private String habitat;

    public Bird() {

    }

    public Bird(String name, String imageUrl, String description, String order, String country, String region, String habitat) {
        this.name=name;
        this.imageUrl=imageUrl;
        this.description=description;
        this.order=order;
        this.country=country;
        this.region=region;
        this.habitat=habitat;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getOrder() {
        return order;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", Order='" + order + '\'' +
                ", Country='" + country + '\'' +
                ", Region='" + region + '\'' +
                ", Habitat='" + habitat + '\'' +
                '}';
    }
}
