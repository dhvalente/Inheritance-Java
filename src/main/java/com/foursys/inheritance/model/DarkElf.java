package com.foursys.inheritance.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@DiscriminatorValue("DarkElf")
@Table(name = "tb_dark_elf")
public class DarkElf extends Elf {

    private String magicType;

    private String demonicMinions;

    private String typeInheritance;

    public DarkElf(){
    }

    public DarkElf(String name, String guild, String magicType, String demonicMinions, String typeInheritance) {
        super(name, guild);
        this.magicType = magicType;
        this.demonicMinions = demonicMinions;
        this.typeInheritance = typeInheritance;
    }
}
