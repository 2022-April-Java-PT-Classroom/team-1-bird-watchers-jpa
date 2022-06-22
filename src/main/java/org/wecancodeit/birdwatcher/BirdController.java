package org.wecancodeit.birdwatcher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String displaySingleBird(@PathVariable String name, Model model){
        Bird retrievedBird = birdRepo.findByName(name);
        model.addAttribute("Bird", retrievedBird);
        return "birdTemplate";
    }

    @RequestMapping("/birdsbyhabitat/{id}")
    public String displayBirdsByHabitat(@PathVariable Long id, Model model) {
       Habitat x = habitRepo.findById(id).get();

        model.addAttribute("Habitat", x.getBirds());
        return "habitatTemplate";
    }

    @RequestMapping("/birdsbyregion/{id}")
    public String displayBirdsByRegion(@PathVariable Long id, Model model) {
        Region x = regionRepo.findById(id).get();

        model.addAttribute("Region", x.getBirds());
        return "regionTemplate";
    }

    @RequestMapping("/birdsbycountry/{id}")
    public String displayBirdsByCountry(@PathVariable Long id, Model model) {
        Country x = countryRepo.findById(id).get();

        model.addAttribute("Country", x.getBirds());
        return "CountryTemplate";
    }

}



