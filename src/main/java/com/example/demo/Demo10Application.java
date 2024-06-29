package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class Demo10Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo10Application.class, args);
    }

    @Bean
    ApplicationRunner runner(
            UserRepository repo
    ) {
        return args -> {
//            var user = User.builder()
//                    .username("Alex").build();
//            user = repo.save(user);
//            log.info("User.id = {}", user.getId());
//
//            var userDetails = UserDetails.builder()
//                    .user(user)
//                    .address("Lviv")
//                    .build();
//            user.setUserDetails(userDetails);
//            repo.save(user);
            log.info("Alex's address is {}", repo.findByUsername("Alex").getUserDetails().getAddress());
        };
    }

}
