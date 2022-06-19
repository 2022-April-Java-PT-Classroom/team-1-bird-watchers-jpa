package org.wecancodeit.birdwatcher;

import org.springframework.stereotype.Controller;
import org.wecancodeit.birdwatcher.BirdRepository;

import javax.annotation.Resource;

@Controller

public class BirdController {
    @Resource
    private BirdRepository birdRepo;
    @Resource
    private HabitatRepository habitRepo;
    @Resource
    private CountryRepository countryRepo;
    @Resource
    private RegionRepository regionRepo;
}
