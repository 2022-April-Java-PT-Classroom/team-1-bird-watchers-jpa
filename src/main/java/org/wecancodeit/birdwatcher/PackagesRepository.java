package org.wecancodeit.birdwatcher;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackagesRepository extends CrudRepository<Packages, Long> {

    Packages findPackagesById(Long id);
}
