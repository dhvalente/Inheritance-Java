package com.foursys.inheritance.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@DiscriminatorValue("Warrior")
public class Warrior extends Person {

    private String sword;

    private String typeInheritance;

    public Warrior(){
    }

    public Warrior(String name, String gender, String sword, String typeInheritance) {
        super(name, gender);
        this.sword = sword;
        this.typeInheritance = typeInheritance;
    }
}
