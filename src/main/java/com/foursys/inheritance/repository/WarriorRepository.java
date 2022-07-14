package com.foursys.inheritance.repository;

import com.foursys.inheritance.model.Warrior;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarriorRepository extends JpaRepository <Warrior, Long> {
}
