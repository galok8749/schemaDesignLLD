package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;

@Entity
public class Exam extends BaseModel {
    private int duration;
    private String name;
}

// springboot see Entity Exam it will create table EXAMS