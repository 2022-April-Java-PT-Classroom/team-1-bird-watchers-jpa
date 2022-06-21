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
        return "countryTemplate";

    }
    @GetMapping("/countries/{id}")
    public String displaySingleCountry(@PathVariable Long id, Model model){
        Country retrievedCountry = countryRepo.findCountryById(id);
        model.addAttribute("country", retrievedCountry);
        return "countryTemplate";
    }
}
