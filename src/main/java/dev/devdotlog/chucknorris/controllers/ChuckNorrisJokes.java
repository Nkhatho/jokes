package dev.devdotlog.chucknorris.controllers;

import dev.devdotlog.chucknorris.services.ChuckNorrisJokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokes {
    private final ChuckNorrisJokesService chuckNorrisJokesService;
    public ChuckNorrisJokes(ChuckNorrisJokesService chuckNorrisJokesService) {
        this.chuckNorrisJokesService = chuckNorrisJokesService;
    }
    @RequestMapping({"/", ""})
    public String getChuckNorrisJoke(Model model) {
        model.addAttribute("joke", chuckNorrisJokesService.getRandomJoke());
        return "index";
    }
}
