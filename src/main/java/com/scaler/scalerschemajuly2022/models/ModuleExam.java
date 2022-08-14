package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;

@Entity
public class ModuleExam extends BaseModel {
    private Module module;
    private Exam exam;
}
