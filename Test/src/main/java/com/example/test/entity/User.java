package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class User  {
    @Id
    private int id;
    private String name;
    private String address;
}
