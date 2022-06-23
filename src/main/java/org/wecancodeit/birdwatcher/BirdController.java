package org.wecancodeit.birdwatcher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.BirdRepository;

import javax.annotation.Resource;

@Controller
@RequestMapping("/bird")


public class BirdController {
    @Resource
    private BirdRepository birdRepo;
    @Resource
    private HabitatRepository habitRepo;
    @Resource
    private CountryRepository countryRepo;
    @Resource
    private RegionRepository regionRepo;

    @GetMapping("/bird/{id}")
    public String displaySingleBird(@PathVariable Long id, Model model){
        Bird x = birdRepo.findById(id).get();

        model.addAttribute("Bird", x);
        return "birdTemplate";
    }

    @RequestMapping("/birdsbyhabitat/{id}")
    public String displayBirdsByHabitat(@PathVariable Long id, Model model) {
       Habitat x = habitRepo.findById(id).get();

        model.addAttribute("Habitat",x);
        return "habitatTemplate";
    }

    @RequestMapping("/birdsbyregion/{id}")
    public String displayBirdsByRegion(@PathVariable Long id, Model model) {
        Region x = regionRepo.findById(id).get();

        model.addAttribute("Region",x);
        return "regionTemplate";
    }

    @RequestMapping("/birdsbycountry/{id}")
    public String displayBirdsByCountry(@PathVariable Long id, Model model) {
        Country x = countryRepo.findById(id).get();

        model.addAttribute("Country", x);
        return "countryTemplate";
    }

}



