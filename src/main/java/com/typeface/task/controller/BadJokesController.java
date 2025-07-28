package com.typeface.task.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BadJokesController {
    @GetMapping("/joke")
    public ResponseEntity<String> printJoke()   {
        String[] dadJokes = {
                "Why did the programmer quit his job? Because he didn't get arrays (a raise).",
                "I told my computer I needed a break, and it said: 'Why? I haven’t crashed in days!'",
                "Why do Java developers wear glasses? Because they don’t C#.",
                "I would tell you a UDP joke, but you might not get it.",
                "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
                "I tried to catch some fog earlier. Mist.",
                "Why did the dad joke cross the road? To get to the pun side.",
                "I’m reading a book about anti-gravity. It’s impossible to put down.",
                "What do you call 8 hobbits? A hob-byte.",
                "Why don’t scientists trust atoms? Because they make up everything.",
                "Parallel lines have so much in common… it’s a shame they’ll never meet.",
                "If you see a crime at an Apple Store, does that make you an iWitness?",
                "I got hit in the head with a can of soda. Good thing it was a soft drink.",
                "Einstein developed a theory about space. And it was about time too.",
                "What's the object-oriented way to become wealthy? Inheritance."
        };
        int index = new Random().nextInt(dadJokes.length);
        return new ResponseEntity<>(dadJokes[index], HttpStatus.OK);
    }
}
