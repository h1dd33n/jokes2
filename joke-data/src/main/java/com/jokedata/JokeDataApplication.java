package com.jokedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.jokedata.repositories")
@SpringBootApplication
public class JokeDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeDataApplication.class, args);
    }

}
