package com.example.dat22agithub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@RestController
public class HomeController {

    @GetMapping("/")
        public static void main(String[] args) {
            List<String> characters = List.of("a hedgehog", "an alien", "a superhero", "a talking rock", "a pirate");
            List<String> actions = List.of("tried to learn salsa dancing", "entered a hot-dog-eating contest", "adopted a pet unicorn", "started a successful cat grooming business", "became an instant TikTok star");
            List<String> places = List.of("in a parallel universe", "on a remote island", "inside a giant donut", "in an underground lair", "at the top of Mount Everest");
            List<String> plotTwists = List.of("when suddenly, they discovered they had the ability to time travel", "when they accidentally created a black hole", "when they found a genie in a soda can", "when they stumbled upon a secret treasure map", "when they won the lottery");

            Random random = new Random();

            String story = String.format("Once upon a time, there was %s. One day, they %s %s. Everything was going fine, %s. And they lived happily ever after, well, sort of.",
                    characters.get(random.nextInt(characters.size())),
                    actions.get(random.nextInt(actions.size())),
                    places.get(random.nextInt(places.size())),
                    plotTwists.get(random.nextInt(plotTwists.size())));

            System.out.println(story);
        }

}
