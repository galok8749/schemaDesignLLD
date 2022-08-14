package com.scaler.scalerschemajuly2022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScalerSchemaJuly2022Application {

    public static void main(String[] args) {

        SpringApplication.run(ScalerSchemaJuly2022Application.class, args);
    }
}

// how to code the classes
// MVC
// M : Model : Entity in my system which are persisted in DB (a class that is going to be stored in database as well)

// Hibernate ORM (object Relational Mapping)
// It will automatically create SQL query for you(it does need to know DB type)