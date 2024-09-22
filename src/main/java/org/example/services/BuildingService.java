package org.example.services;

import org.example.entities.Building;
import org.example.entities.Room;
import org.example.repositories.BuildingRepository;
import org.example.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    @Autowired
    private RoomRepository roomRepository;

    public Building addBuilding(Building building) {
        return buildingRepository.save(building);
    }

    public Room addRoom(Long buildingId, Room room) {
        Building building = buildingRepository.findById(buildingId).orElseThrow();
        room.setBuilding(building);
        return roomRepository.save(room);
    }

    public List<Room> getRoomsForBuilding(Long buildingId) {
        Building building = buildingRepository.findById(buildingId).orElseThrow();
        return building.getRooms();
    }
}