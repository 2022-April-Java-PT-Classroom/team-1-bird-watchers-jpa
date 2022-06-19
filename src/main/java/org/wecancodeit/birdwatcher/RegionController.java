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

    @RequestMapping({"/Region", "/", ""})
    public String displayRegions(Model model) {
        model.addAttribute("regions", regionRepo.findAll());
        return "regionsView";
    }

    @GetMapping("/regions/{regionLocation}")
    public String displaySingleRegion(@PathVariable String regionName, Model model) {
        Region retrievedRegion = regionRepo.findByName(regionName);
        model.addAttribute("region", retrievedRegion);

        return "regionView";
    }
}
