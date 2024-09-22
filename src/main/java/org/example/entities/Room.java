package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private int capacity;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;

    public Long getId(){ return id; }

    public void setId(Long id){ this.id = id; }

    public String getNumber(){ return number; }
    public void setNumber(String number){ this.number = number; }

    public int getCapacity(){ return capacity; }
    public void setCapacity(int capacity){ this.capacity = capacity; }

    public Building getBuilding(){ return building; }
    public void setBuilding(Building building){ this.building = building; }


    // Getters and Setters
}
