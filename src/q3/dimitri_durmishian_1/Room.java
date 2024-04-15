package q3.dimitri_durmishian_1;

public class Room {
    private int roomNumber;
    private boolean occupied;
    private Person occupant;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.occupied = false;
        this.occupant = null;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Person getOccupant() {
        return occupant;
    }

    public void setOccupant(Person occupant) {
        this.occupant = occupant;
        this.occupied = (occupant != null);
    }
}
