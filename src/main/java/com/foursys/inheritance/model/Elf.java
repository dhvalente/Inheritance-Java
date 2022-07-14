package com.foursys.inheritance.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Setter
@Getter
@Entity
@DiscriminatorColumn(name = "ELF_TYPE")
public class Elf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String guild;

    public Elf(){
    }

    public Elf(String name, String guild) {
        this.name = name;
        this.guild = guild;
    }
}
