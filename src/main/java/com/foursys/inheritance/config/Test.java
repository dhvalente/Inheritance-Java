package com.foursys.inheritance.config;

import com.foursys.inheritance.model.DarkElf;
import com.foursys.inheritance.model.FrostSpell;
import com.foursys.inheritance.model.Spell;
import com.foursys.inheritance.model.Warrior;
import com.foursys.inheritance.repository.DarkElfRepository;
import com.foursys.inheritance.repository.FrostSpellRepository;
import com.foursys.inheritance.repository.WarriorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test implements CommandLineRunner {

    @Autowired
    private WarriorRepository studentRepository;

    @Autowired
    private FrostSpellRepository frostSpellRepository;

    @Autowired
    private DarkElfRepository darkElfRepository;

    @Override
    public void run(String... args) throws Exception {

        Warrior warrior = new Warrior("Diogo Valente", "Male", "Rapier", "Single Table");
        studentRepository.save(warrior);


        Spell frostBolt = new FrostSpell("Frost Bolt", 80, 80, true, 300, "Table Per Class");
        frostSpellRepository.save(frostBolt);

        DarkElf darkElf = new DarkElf("Alika" , "Warlock", "Summon", "Imp" , "Joined");
        darkElfRepository.save(darkElf);

    }
}
