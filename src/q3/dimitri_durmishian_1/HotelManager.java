package q3.dimitri_durmishian_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelManager {
    private List<Room> rooms;
    private Map<String, Room> guestMap;

    public HotelManager(int numberOfRooms) {
        rooms = new ArrayList<>();
        guestMap = new HashMap<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            Room room = new Room(i);
            rooms.add(room);
        }
    }

    public Room checkIn(Person person) {
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                room.setOccupant(person);
                guestMap.put(person.getId(), room);
                return room;
            }
        }
        return null;
    }

    public boolean checkOut(Person person) {
        Room room = guestMap.get(person.getId());
        if (room != null && room.getOccupant().equals(person)) {
            room.setOccupant(null);
            guestMap.remove(person.getId());
            return true;
        }
        return false;
    }

    public void displayInfo() {
        System.out.println("Hotel Guests Information:");
        for (Map.Entry<String, Room> entry : guestMap.entrySet()) {
            String personId = entry.getKey();
            Room room = entry.getValue();
            Person person = room.getOccupant();
            System.out.println("Person ID: " + personId + ", Name: " + person.getName() + " " + person.getSurname() + ", Room Number: " + room.getRoomNumber());
        }
    }
}
