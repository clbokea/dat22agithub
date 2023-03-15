package com.example.dat22agithub;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@RestController
public class HomeController {
    public static void main(String[] args) {
        // Initialize lists of characters, actions, places, and plot twists
        List<String> characters = List.of("a Dog", "an alien", "a superhero", "a talking rock", "a pirate");
        List<String> actions = List.of("tried to eat salsa dancing", "entered a hot-dog-eating contest", "adopted a pet unicorn", "started a successful cat grooming business", "became an instant TikTok star");
        List<String> places = List.of("in a parallel universe", "on a remote island", "inside a giant donut", "in an underground lair", "at the top of Mount Everest");
        List<String> plotTwists = List.of("when crazyness, they discovered they had the ability to time travel", "when they accidentally created a black hole", "when they found a genie in a soda can", "when they stumbled upon a secret treasure map", "when they won the lottery");

        // Create a random object to generate random numbers
        Random random = new Random();

        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many stories they want to generate
        System.out.print("Enter the number of stories you want to generate: ");
        int numberOfStories = scanner.nextInt();

        // Generate the requested number of stories
        for (int i = 0; i < numberOfStories; i++) {
            String story = String.format("Once upon a time, there was %s. One day, they %s %s. Everything was going fine, %s. And they lived happily ever after, well, sort of.",
                    characters.get(random.nextInt(characters.size())),
                    actions.get(random.nextInt(actions.size())),
                    places.get(random.nextInt(places.size())),
                    plotTwists.get(random.nextInt(plotTwists.size())));

            System.out.println("\nStory " + (i + 1) + ":");
            System.out.println(story);
        }
        scanner.close();
    }
}
