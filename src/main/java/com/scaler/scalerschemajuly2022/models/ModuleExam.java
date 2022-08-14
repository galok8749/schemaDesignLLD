package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class ModuleExam extends BaseModel {
    @ManyToOne
    private Module module; // ModuleExam  : Module
    // 1 :  1
    // M : 1

    @ManyToOne
    private Exam exam;
    // ModuleExam : Exam
    //   1 : 1
    //   M : 1

    private Date dateOfExam;
}
// if the type of attribute of class is datatype that is also being persisted  => means
// we are talking about relationship between two classes
// must specify cardinality of relation so that springboot can create tables appropriately



// cardinality between ModuleExam : Module
// 1 Module can have multiple Exam
//