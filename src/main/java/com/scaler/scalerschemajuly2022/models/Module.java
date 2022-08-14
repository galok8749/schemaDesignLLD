package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Module extends BaseModel {
    private String name;
    @ManyToMany
    private List<Student> enrolledStudents;

    @OneToMany(mappedBy = "module")
    private List<ModuleExam> moduleExam;
}
