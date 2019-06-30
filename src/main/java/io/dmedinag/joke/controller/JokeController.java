package io.dmedinag.joke.controller;

import io.dmedinag.joke.service.JokeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for showing jokes
 */
@Controller
public class JokeController {

    @Autowired
    private JokeGenerator jokeGenerator;

    /**
     * Displays a Chuck Norris joke using the "joke" template
     * @param model stores the type of joke and joke string for populating the template
     * @return "joke" template, after updating the model with the correct values
     */
    @GetMapping({"", "/"})
    public String jokeController(Model model) {

        model.addAttribute("jokeType", "Chuck Norris");
        model.addAttribute("joke", jokeGenerator.getJoke());

        return "joke";
    }
}
