package org.wecancodeit.birdwatcher;

import org.springframework.data.repository.CrudRepository;

public interface HabitatRepository extends CrudRepository<Habitat, Long> {

    Habitat findHabitatById(Long id);
}
