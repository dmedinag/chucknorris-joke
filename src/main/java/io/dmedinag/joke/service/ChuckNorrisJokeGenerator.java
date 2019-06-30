package io.dmedinag.joke.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Chuck Norris implementation of a JokeGenerator
 */
@Service
public class ChuckNorrisJokeGenerator implements JokeGenerator {

    private ChuckNorrisQuotes quotes;

    /**
     * Constructor of a JokeGenerator for Chuck Norris jokes
     * @param quotes Chuck Norris jokes repository
     */
    @Autowired
    public ChuckNorrisJokeGenerator(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
