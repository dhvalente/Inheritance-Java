package com.foursys.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class FrostSpell extends Spell {
    private boolean freezing;
    private Integer freezeDuration;

    private String typeInheritance;

    public FrostSpell() {
    }

    public FrostSpell(String name, Integer energyCost,
                      Integer damage, boolean freezing,
                      Integer freezeDuration, String typeInheritance) {
        super(name, energyCost, damage);
        this.freezing = freezing;
        this.freezeDuration = freezeDuration;
        this.typeInheritance = typeInheritance;
    }
}