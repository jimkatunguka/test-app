package com.example.testcontroller.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
public class Widget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private int version_number;

//    public Widget(int id, String name, String description, int version_number) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.version_number = version_number;
//    }
}
