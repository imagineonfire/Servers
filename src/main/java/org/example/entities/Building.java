package org.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private String address;

    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL)
    private List<Room> rooms;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public List<Room> getRooms() {return rooms;}
    public void setRooms(List<Room> rooms) {this.rooms = rooms;}
    // Getters and Setters
}