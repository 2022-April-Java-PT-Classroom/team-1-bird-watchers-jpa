package org.wecancodeit.birdwatcher;

import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {

    Country findLocationByCountry(String countryLocation);

}
