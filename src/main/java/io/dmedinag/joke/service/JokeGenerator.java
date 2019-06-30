package io.dmedinag.joke.service;

/**
 * Generator of jokes
 */
public interface JokeGenerator {

    /**
     * @return a new joke as a string
     */
    String getJoke();
}
