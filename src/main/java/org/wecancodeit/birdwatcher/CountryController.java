package org.wecancodeit.birdwatcher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class CountryController{

    private final CountryStorage countryStorage;

    public CountryController(CountryStorage countryStorage){
        this.countryStorage = countryStorage;
    }

    @Resource
    private CountryRepository countryRepo;
    @Resource
    private RegionRepository regionRepo;

    @RequestMapping({"/countries", "/", ""})
    public String displayCountries(Model model, @PathVariable Long id){
        model.addAttribute("countries", countryStorage.findAllCountries());
        return "countriesView";
    }
    @GetMapping("/countries/{countryLocation}")
    public String displaySingleCountry(@PathVariable String countryLocation, Model model){
        Country retrievedCountry = countryStorage.findCountryByLocation(countryLocation);
        model.addAttribute("country", retrievedCountry);

        return "countryView";

    }
    @PostMapping("/add-country")
    public String addCountry(@RequestParam String location){
        countryStorage.store(new Country(location));
        return "redirect:countries";
    }

}
