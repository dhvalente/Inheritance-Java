package com.foursys.inheritance.repository;

import com.foursys.inheritance.model.Spell;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrostSpellRepository extends CrudRepository<Spell, Long> {
}