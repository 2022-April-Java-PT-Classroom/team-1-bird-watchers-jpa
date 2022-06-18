package org.wecancodeit.birdwatcher;

import org.wecancodeit.birdwatcher.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {

    Optional<Country> findByLocation(String countryLocation);

}
