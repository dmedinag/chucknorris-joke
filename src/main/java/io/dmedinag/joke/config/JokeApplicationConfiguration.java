package io.dmedinag.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration file for the Jokes application
 */
@Configuration
public class JokeApplicationConfiguration {

    /**
     * @return ChuckNorrisQuotes instance as repository for Chuck Norris jokes
     */
    @Bean
    public ChuckNorrisQuotes quotes() {
        return new ChuckNorrisQuotes();
    }
}
