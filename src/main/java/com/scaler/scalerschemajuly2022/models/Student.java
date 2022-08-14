package com.scaler.scalerschemajuly2022.models;

import javax.persistence.Entity;

@Entity
public class Student extends BaseModel {
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String password;
}
