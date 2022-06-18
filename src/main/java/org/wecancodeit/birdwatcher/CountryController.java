package org.wecancodeit.birdwatcher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class CountryController{
    @Resource
    private CountryRepository countryRepo;
    @Resource
    private RegionRepository regionRepo;

    @RequestMapping({"/countries", "/", ""})
    public String displayCountries(Model model, @PathVariable Long id){
        model.addAttribute("countries", countryRepo.findById(id).get());
        return "countriesView";
    }

}
