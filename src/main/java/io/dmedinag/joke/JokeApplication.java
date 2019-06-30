package io.dmedinag.joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Starting point of a Joke Application
 */
@SpringBootApplication
public class JokeApplication {

    /**
     * Entry method of the JokeApplication
     * @param args unused command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(JokeApplication.class, args);
    }

}
