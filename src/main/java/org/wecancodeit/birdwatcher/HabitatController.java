package org.wecancodeit.birdwatcher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class HabitatController {

    @Resource
    private HabitatRepository habitatRepo;

    @RequestMapping("/habitat/{id}")
    public String displaySingleHabitat(@PathVariable Long id, Model model){
       Habitat retrievedHabitat = habitatRepo.findHabitatById(id);
       model.addAttribute("habitat", retrievedHabitat);
       return "habitatTemplate";
    }

    @RequestMapping("/habitats")
    public String displayHabitats(Model model) {
        model.addAttribute("habitats", habitatRepo.findAll());
        return "habitatTemplate";
    }
}
