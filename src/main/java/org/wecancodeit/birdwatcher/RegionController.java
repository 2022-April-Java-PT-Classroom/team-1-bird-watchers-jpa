package org.wecancodeit.birdwatcher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegionController {
    @RequestMapping({"/Region", "/", ""})
    public String displayRegions(Model model) {
        model.addAttribute("regions", regionStorage.findAllRegions());
        return "regionsView";
    }

    @GetMapping("/regions/{regionLocation}")
    public String displaySingleCampus(@PathVariable String campusLocation, Model model) {
        Region retrievedRegion = regionStorage.findCampusByLocation(campusLocation);
        model.addAttribute("region", retrievedRegion);

        return "regionView";
    }
}
