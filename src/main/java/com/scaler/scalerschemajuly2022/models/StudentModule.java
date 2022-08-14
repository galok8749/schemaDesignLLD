package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;

@Entity
public class StudentModule extends BaseModel {
    private Student student;
    private Module module;
}
// Student s = new Student()
// Exam e =  s.getExam()
// ORM : Object Relational Mapping { in your application when you run we have object but in database we have relational model  }
// ORM maps object to relation