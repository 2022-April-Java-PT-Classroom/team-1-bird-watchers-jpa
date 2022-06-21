package org.wecancodeit.birdwatcher;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BirdRepository extends CrudRepository <Bird, Long> {
    Bird findByName(String name);
    List<Bird> findBirdByCountry(Country country);
    List<Bird> findBirdByRegion(Region region);
    List<Bird> findBirdByHabitat(Habitat habitat);


}
