package org.wecancodeit.birdwatcher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class CountryController{

    @Resource
    private CountryRepository countryRepo;

    @RequestMapping({"/countries", "/", ""})
    public String displayCountries(Model model){
        model.addAttribute("countries", countryRepo.findAll());
        return "countriesView";
        //This return is subject to change depending on html path
    }
    @GetMapping("/countries/{location}")
    public String displaySingleCountry(@PathVariable String location, Model model){
        Country retrievedCountry = countryRepo.findByCountryLocation(location);
        model.addAttribute("country", retrievedCountry);
        return "countryView";
        //This return is subject to change depending on html path.
    }
}
