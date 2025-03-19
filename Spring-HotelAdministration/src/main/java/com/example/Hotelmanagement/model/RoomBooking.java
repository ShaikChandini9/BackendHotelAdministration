package com.example.Hotelmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoomBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String roomname;
    @Column(nullable = false)
    private int noOfRooms;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private String timings;
}
