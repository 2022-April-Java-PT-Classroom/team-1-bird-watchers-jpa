package org.wecancodeit.birdwatcher;

import java.util.Collection;

public interface CountryStorage {
    Collection<Country> findAllCountries();

    void store(Country country);

    Country findCountryByLocation(String countryLocation);
}
