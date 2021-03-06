package com.carcha.graphql;

import com.carcha.graphql.domain.Pokemon;
import com.carcha.graphql.domain.PokemonType;
import com.carcha.graphql.repository.PokemonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Main app
 */
@SpringBootApplication
public class PokedexApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokedexApplication.class, args);
    }

    /**
     * Initial Pokemon example
     * @param pokemonRepository repo
     * @return CommandLineRunner
     */
    @Bean
    public CommandLineRunner fillDatabase(PokemonRepository pokemonRepository) {
        return (args) -> {
            pokemonRepository.save(Pokemon.builder()
                    .name("Squirtle")
                    .pokemonType(PokemonType.water)
                    .build());
        };
    }

}
