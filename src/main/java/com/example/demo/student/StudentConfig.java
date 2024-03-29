package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sabik = new Student("Adri Sabik", "adri@sabik.com", LocalDate.of(2002, Month.JANUARY, 5));
            Student shinta = new Student("Sinta Nuriah",  "sinta@nuriah.com", LocalDate.of(2000, Month.JANUARY, 5));
            repository.saveAll(
                List.of(sabik, shinta)
            );
        };
    }
}
