package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Student extends BaseModel {
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String password;
    // relation between student and module without relation attribute so delete StudentModule class
    @ManyToMany
    private List<Module> enrolledModules;
}
// S : M
// 1 : M
// M :  1