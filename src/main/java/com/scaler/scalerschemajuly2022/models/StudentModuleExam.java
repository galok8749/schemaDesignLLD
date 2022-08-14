package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;

@Entity
public class StudentModuleExam extends BaseModel {
    private Student student;
    private ModuleExam moduleExam;
}
