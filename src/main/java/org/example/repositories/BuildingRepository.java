package org.example.repositories;

import org.example.entities.Building;
import org.example.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Long> {
}

