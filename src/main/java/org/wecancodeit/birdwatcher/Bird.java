package org.wecancodeit.birdwatcher;

import javax.persistence.*;

@Entity
public class Bird {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    private String description;
    @ManyToOne
    private String order;
    @ManyToMany
    private Country country;
    @ManyToOne
    private Region region;
    @ManyToOne
    private Habitat habitat;

    public Bird() {

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

    public Country getCountry() {
        return country;
    }

    public Region getRegion() {
        return region;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public Bird(Long id, String name, String imageUrl, String description, String order Country country, Region region, Habitat habitat) {
        this.id= id;
        this.name=name;
        this.imageUrl=imageUrl;
        this.description=description;
        this.order=order;

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
