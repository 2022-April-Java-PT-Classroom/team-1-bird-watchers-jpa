package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private CountryRepository countryRepo;
    @Resource
    private RegionRepository regionRepo;
    @Resource
    private HabitatRepository habitatRepo;
    @Resource
    private BirdRepository birdRepo;

    public Populator() {
    }

    @Override
    public void run(String... args) throws Exception {

        Country peru = new Country("Peru", "With more than 1800 bird species, Peru is one of the best tropical birdwatching destinations in South America. Our guides guides have years of experience navigating through the different regions in Peru, and will guide you through some of the most biologically rich areas in Peru. Whether you want to see the many species of birds that live along the Andes, or the Coast, we know for certain you will enjoy your birdwatching excursion in Peru.", "static/Images/CountryPeru.jpg");
        Country ecuador = new Country("Ecuador", "Ecuador is a birdwatcher's paradise. All of the regions and habitats in Ecuador offer unique opportunities to see a variety of species. There are roughly 1600 species of birds in Ecuador, and our guides know where to find many of them, from the rare to the common. Grab your binoculars and your field guides, and book your next trip in beautiful Ecuador!", "static/Images/CountryEcuador.jpg");
        countryRepo.save(peru);
        countryRepo.save(ecuador);

        Region coast = new Region("Coast");
        Region mountain = new Region("Mountain");
        Region forest = new Region("Forest");
        regionRepo.save(coast);
        regionRepo.save(mountain);
        regionRepo.save(forest);

        Habitat cloudForest = new Habitat("Andean Cloud Forest", "The cloud forests of the Andes occur because of humidity moving west from the Amazon rainforest, and cooling as if moves toward the mountains. The condensation provides the moisture needed to support the flora and fauna that live in this location. Being at the base of the Andes, this is an ideal habitat to see a variety of forest species that have adapted to life at higher altitudes. We know you will enjoy your birdwatching experience in the beautiful cloud forests of the Andes!", "static/Images/AndeanCloud.jpg");
        Habitat beach = new Habitat("Beach", "Peru's Pacific coastline stretches for 1,500 miles along the Western side of the nation. Within the coast, there are a variety of landscapes, from desert-like landscapes, rocky cliffs, and white sandy tropical beaches. If seeing the emporer penguins that call this area home is something you have on your bucket list, or if you would like to see the other shore birds, than consider booking a birding trip to the beaches of Peru.", "static/Images/Beach.jpeg");
        Habitat galapagos = new Habitat("Galapagos Islands","The Galapagos islands are a group of islands off the coast of Ecuador. This geographic location is known for it's large number of endemic species, which includes its birds. Inspired by the documented voyages of Charles Darwin, the father of evolutionary theory, people come here to see the many finch species, which all have unique adaptations in their beaks and size! In addition to the finches, there are so many other species that you will find nowhere else on the planet! This is an area that people dream of visiting, and we can help you fulfill that dream.", "static/Images/Galapagos.jpg");
        Habitat paramo = new Habitat("Paramo Grasslands", "The Paramo grasslands consist of high altitude grass and shrublands along the Andes. The plants and animals, including the birds that call this place home, have adapted to the high altitudes and cool conditions. While not as biologically rich as some of the habitats in our bird watching packages, there is still a lot to see! The stunning mountain views, and the variety of grassland species, along with our skill at traversing this landscape, will provide a wonderful birdwatching experience! ", "static/Images/ParamoGrassland.jpg");
        Habitat rainforest = new Habitat("Amazon Rainforest", "The rainforest that lies along the Amazon river basin, is a moist, biologically rich tropical biome. One in ten species in the world lives in the Amazon rainforest! This includes over 2000 species of birds. You don't have to walk far in the rainforests of the Amazon to see a variety of colorful birds. Our guides are experienced at navigating our clients through this terrain, and take pleasure in showing the biological diversity of this beautiful location.", "static/Images/Rainforest.jpg");
        habitatRepo.save(cloudForest);
        habitatRepo.save(beach);
        habitatRepo.save(galapagos);
        habitatRepo.save(paramo);
        habitatRepo.save(rainforest);

        //Not sure what syntax to use for the order, habitat, region, and country for bird objects in populator. Not sure if we should use type, String for country, region, and habitat. We need to be able to categorize birds by these variables in our templates, so we need to figure that out.
        Bird incaTern = new Bird("Inca Tern", "static/Images/beach_inca_tern.jpeg", "A bird with an unmistakably-colored plumage, native to Peru and Chile. It can be identified by its slate grey body and mustache-like markings on both sides of its head. The beak and feet are also a very bright orange-color.", "Charadriiformes", peru, coast, beach);
        Bird pelican = new Bird("Peruvian Pelican", "static/Images/beach_pelican.jpg", "This bird is expremely common along the West coast of South America, including Chile and Northern Peru. A gregarious bird, it is often seen in small groups. They are quite large for a pelican and dark in color, with white stripe from the top of the bill up to the crown and down the sides of the neck. They have tufted feathers on top of their head. The beak is a bright orange with a blueish underside.", "Pelecaniformes", peru, coast, beach);
        Bird humboldt = new Bird("humboltPenguin", "static/Images/beaches_humbolt.jpeg", "A medium-sized penguin that lives off of the coast of Peru. Like most penguins it prefers cold water currents, which is also where it gets its name. They grow to roughly 28 inches long and weigh up to about 15 lb. Humboldt penguins have a black head with a white border that runs from behind the eye, around the black ear-covers and chin, and joins at the throat. They have a pinkish fleshy base on their bill. Like most penguins they have black upper parts and white under parts.", "Sphenisciformes", peru, coast, beach);
        Bird fruitEater = new Bird("Masked Fruiteater", "static/Images/cloud_forest_masked_fruiteater .jpg", "As its name suggests, the masked fruiteater is a bird that has a diet of mostly fruits. Its quite common in the forests lying along the slopes of the Andes mountains. Its a medium size bird with bright green plumage and a pinkish-orange beak.", "Passeriformes", peru, forest, cloudForest);
        Bird treeRunner = new Bird("Pearled Treerunner", "static/Images/cloud_forest_pearled_treerunner.jpg", "A common songbird that is commonly found in the montane forests (forests along the slopes of mountains) of the Andean mountains. It is an insectivorous species, which means it feeds on only insects. Pearled treerunners have brown plumage on their backs, with white and black spotted plumage on their underside.", "Passeriformes", peru, forest, cloudForest);
        Bird wren = new Bird("Peruvian Wren", "static/Images/cloud_forest_peruvian_wren.jpg", "A common bird in the montane regions of Peru. It is small at around 6 inches long. The color is mainly chestnut, with the tail feathers being slightly redder than the rest of the plumage. Their faces have variable patches of white. The chin, throat, and belly are a slightly orange-brown. Their diets aren't very well-documented.", "Passeriformes", peru, forest, cloudForest);
        Bird finch = new Bird ("Darwin's Finches", "static/Images/galapagos_finches.jpg", "The Galapagos Finches have specialized beaks, which are adaptations to the various niches in the volcanic Galapagos islands off the coast of Ecuador. The size is also quite variable. Some are small, at around 4 inches in length, while others are up to 8 inches long. They were a subject of Charles Darwin's research after he visited the Galapagos islands in 1835.", "Passeriformes", ecuador, coast, galapagos);
        Bird flamingo = new Bird ("Carribean Flamingo", "static/Images/galapagos_flamingo.jpg", "The Carribean flamingo is a large, pink-colored bird that wades and feeds in shallow waters in tropical South America, the Bahamas, West Indies, Virgin Islands, and other tropical ares. It is also found on the Galapagos Islands. They atand about 45-55 inches tall and weigh on average, bout 6lb.", "Phoenicopteriformes", ecuador, coast, galapagos);
        Bird frigateBird = new Bird ("Frigate Bird", "static/Images/galapagos_frigate.jpg", "The frigate bird is found across all tropical and subtropical oceans. They are also found along the coasts of the Galapagos Islands. They have mostly black plumage, long, forked tails and hooked bills. For a flighted bird they are large at 45 inches in length. The females are 25 percent larger than the males.", "Suliformes", ecuador, coast, galapagos);
        Bird caracara = new Bird ("Carunculated Caracara", "static/Images/paramo_caruculated_caracara.jpg", "An opportinistic falconoform, that is found in the paramo grasslands around the Andes. They are mostly black with a black and white streaked underside. They have light-colored beaks with an orange, fleshy base.", "Falconiformes", peru, mountain, paramo);
        Bird ibis = new Bird ("Black-Faced Ibis", "static/Images/paramo_ibis.jpeg", "A large bird found in the Paramo grasslands in South America, with a long hooked beak. They are approximately 30 inches in length, with a greyish-colored body, cinnamon-colored nape. The legs are a a red color.", "Pelecaniformes", peru, mountain, paramo);
        Bird pipit = new Bird ("Pipit", "static/Images/paramo_pipit.jpeg", "A small grassland bird found everywhere, excluding the dryest/hottest and the Arctic. They are quite common in the grasslands of Peru. They are insectivorous ground-nesters. Their plumage is mainly brown, and they have long tail  feathers. They are between 6-8 inches as adults.", "Passeriformes", peru, mountain, paramo);
        Bird hoatzin = new Bird ("Hoatzin", "static/Images/rainforest_hoatzin.jpeg", "A very unique bird, the only extant genus of its family, found in the forests of the amazon, including Peru. Their size is similar to a pheasant at about 25 inches in length. It has a unfeathered, blue face with maroon eyes. They have large tufted feathers on their head. They have a darker upperside, with a chesnut-colored underside, including the wings.", "Opisthocomiformes", ecuador, forest, rainforest);
        Bird macaw = new Bird ("Scarlet Macaw", "static/Images/rainforest_macaw.jpeg", "A large, red, yellow, and blue parrot, native to many tropical regions, including the rainforests of peru. The Scarlet Macaw has a mainly red body, with yellow and blue markings on its wings. They are giant parrots, that are about 32 inches in length.", "Psittaciformes", ecuador, forest, rainforest);
        Bird toucan = new Bird ("Toucan", "static/Images/rainforest_toucan.jpeg", "A large bird with an unmistakably-large,  black yellow and blue beak. They are about 25 inches in length, with a beak of about 9 inches. Their color is primarily black, with a white throat.", "Piciformes", ecuador, forest, rainforest);
        birdRepo.save(incaTern);
        birdRepo.save(pelican);
        birdRepo.save(humboldt);
        birdRepo.save(fruitEater);
        birdRepo.save(treeRunner);
        birdRepo.save(wren);
        birdRepo.save(finch);
        birdRepo.save(flamingo);
        birdRepo.save(frigateBird);
        birdRepo.save(caracara);
        birdRepo.save(ibis);
        birdRepo.save(pipit);
        birdRepo.save(hoatzin);
        birdRepo.save(macaw);
        birdRepo.save(toucan);
    }

}
