/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.learn.student;

import java.time.LocalDate;
import java.time.Month;
import static java.time.Month.FEBRUARY;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author admin
 */
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
     Student martin=
    new Student("Martin",LocalDate.of(1991,FEBRUARY, 10),"martin@mspace.co.ke" );
     Student mary=
    new Student("Mary",LocalDate.of(1995,FEBRUARY, 10),"mary@mspace.co.ke" );
     repository.saveAll(
     List.of(martin,mary)
     );
        };
    }
}
