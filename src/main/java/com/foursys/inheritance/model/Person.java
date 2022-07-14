package com.foursys.inheritance.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Setter
@Getter
@Entity
@DiscriminatorColumn(name = "PERSON_TYPE")
public class Person {

    @Id
    @Column(name = "id_person")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String gender;

    public Person() {}

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person: " + name + " Gender: " + gender;
    }
}