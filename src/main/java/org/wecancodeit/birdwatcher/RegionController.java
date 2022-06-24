package org.wecancodeit.birdwatcher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class RegionController {

    @Resource
    private RegionRepository regionRepo;

    @RequestMapping({"/regions"})
    public String displayRegions(Model model) {
        model.addAttribute("regions", regionRepo.findAll());
        return "regionsTemplate";
    }

    @RequestMapping("/region/{id}")
    public String displaySingleRegion(@PathVariable Long id, Model model) {
        Region retrievedRegion = regionRepo.findRegionById(id);
        model.addAttribute("region", retrievedRegion);
        return "regionTemplate";
    }
}
