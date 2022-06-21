package org.wecancodeit.birdwatcher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/bird/{name}")
    public String displaySingleCountry(@PathVariable String name, Model model){
        Bird retrievedBird = birdRepo.findByName(name);
        model.addAttribute("country", retrievedBird);
        return "birdTemplate";

    }
}



