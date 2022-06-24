package org.wecancodeit.birdwatcher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class HomeController {
    @Resource
    private PackagesRepository packagesRepository;

    @GetMapping("/")
    public String displayHomePage(Model model){
        model.addAttribute("Packages", packagesRepository.findAll());
        return "home";

    }

    @RequestMapping("/developers")
    public String displayDevelopersPage(Model model){
        model.addAttribute("Packages", packagesRepository.findAll());
        return "developers";

    }

    @RequestMapping("/country")
    public String displayCountryPage(Model model){
        model.addAttribute("Packages", packagesRepository.findAll());
        return "country";

    }

    @RequestMapping("/region")
    public String displayRegionPage(Model model){
        model.addAttribute("Packages", packagesRepository.findAll());
        return "region";

    }

    @RequestMapping("/habitat")
    public String displayHabitatPage(Model model){
        model.addAttribute("Packages", packagesRepository.findAll());
        return "habitat";

    }

    @RequestMapping("/requestinfo")
    public String displayRequestInfoPage(Model model){
        model.addAttribute("Packages", packagesRepository.findAll());
        return "requestinfo";

    }
}