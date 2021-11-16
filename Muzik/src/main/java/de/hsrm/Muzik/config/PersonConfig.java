package de.hsrm.Muzik.config;

import de.hsrm.Muzik.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//class for testing
@Configuration
public class PersonConfig {

    private static final Logger log = LoggerFactory.getLogger(PersonConfig.class);


    @Bean
    CommandLineRunner commandLineRunner (PersonRepository personRepository) {
        return args -> {

        };
    }
}
