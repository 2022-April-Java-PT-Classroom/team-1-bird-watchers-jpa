package org.wecancodeit.birdwatcher;

import javax.persistence.*;

@Entity
public class Bird {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    @Lob
    private String description;
    private String birdOrder;
    @ManyToOne
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

    public String getBirdOrder() {
        return birdOrder;
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

    public Bird(String name, String imageUrl, String description, String birdOrder, Country country, Region region, Habitat habitat) {
        this.name=name;
        this.imageUrl=imageUrl;
        this.description=description;
        this.birdOrder=birdOrder;
        this.country=country;
        this.region=region;
        this.habitat=habitat;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", Order='" + birdOrder + '\'' +
                ", Country='" + country + '\'' +
                ", Region='" + region + '\'' +
                ", Habitat='" + habitat + '\'' +
                '}';
    }
}
