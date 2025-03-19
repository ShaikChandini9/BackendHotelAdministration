package com.example.Hotelmanagement.service;

import com.example.Hotelmanagement.dto.RoomDto;
import com.example.Hotelmanagement.model.Room;
import com.example.Hotelmanagement.repository.RoomRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RoomServiceTest {

    @InjectMocks
    RoomService roomService;

    @Mock
    RoomRepository roomRepository;

    RoomDto roomDto=new RoomDto();
    Room room=new Room();
    List<Room> roomList=new ArrayList<>();

    @BeforeEach

    public void room(){

        roomDto.setId(123L);
        roomDto.setRoomname("suite");
        roomDto.setRoomtype("deluxe");
        roomDto.setImg("img");
        roomDto.setPrice(100);

    }
    @Test
    public void addRoomTest(){
        Mockito.lenient().when(roomRepository.save(room)).thenReturn(room);
        roomService.addRoom(roomDto);
    }

    @Test
    public void getAllRoomsTest(){
        roomList.add(room);
        when(roomRepository.findAll()).thenReturn(roomList);
        List<Room> actual=roomService.getAllRooms();
        assertNotNull(actual);
    }

    @Test
    public void getRoomByIdTest() {
        Room room = new Room();
        room.setId(12L); // Set the ID for the room
        when(roomRepository.findById(12L)).thenReturn(Optional.of(room)); // Mock behavior

        Room actual = roomService.getRoomById(12L); // Call the method under test

        assertNotNull(actual); // Verify that the actual room is not null
        assertEquals(room.getId(), actual.getId()); // Check that the ID matches
    }


}
