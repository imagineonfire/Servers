package org.example.controllers;

import org.example.entities.Building;
import org.example.entities.Room;
import org.example.services.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @PostMapping("/building")
    public ResponseEntity<Building> addBuilding(@RequestBody Building building) {
        Building createdBuilding = buildingService.addBuilding(building);
        return ResponseEntity.ok(createdBuilding);
    }

    @PostMapping("/building/{buildingId}/room")
    public ResponseEntity<Room> addRoom(@PathVariable Long buildingId, @RequestBody Room room) {
        Room createdRoom = buildingService.addRoom(buildingId, room);
        return ResponseEntity.ok(createdRoom);
    }

    @GetMapping("/building/{buildingId}/rooms")
    public ResponseEntity<List<Room>> getRoomsForBuilding(@PathVariable Long buildingId) {
        List<Room> rooms = buildingService.getRoomsForBuilding(buildingId);
        return ResponseEntity.ok(rooms);
    }
}