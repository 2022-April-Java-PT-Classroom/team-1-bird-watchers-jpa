package org.wecancodeit.birdwatcher;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends CrudRepository<Region, Long> {
    List<Region> findByName(String name);


}
