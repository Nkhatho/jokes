package dev.devdotlog.chucknorris.services;

import dev.devdotlog.chucknorris.controllers.ChuckNorrisJokes;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesServiceImpl implements ChuckNorrisJokesService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
