package com.foursys.inheritance.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Spell {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer energyCost;
    private Integer damage;

    public Spell() {
    }

    public Spell(String name, Integer energyCost, Integer damage) {
        this.name = name;
        this.energyCost = energyCost;
        this.damage = damage;
    }
}