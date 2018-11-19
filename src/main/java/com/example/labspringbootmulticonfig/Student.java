package com.example.labspringbootmulticonfig;

import javax.persistence.*;

@Entity
public class Student {

    @javax.persistence.Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String passportNumber;
}
