package org.wecancodeit.birdwatcher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.BirdRepository;

import javax.annotation.Resource;

@Controller
@RequestMapping("/bird")
@GetMapping
public
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
