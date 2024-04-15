package q3.dimitri_durmishian_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotelManager hotelManager = new HotelManager(15);

        List<Person> persons = PersonManager.getPersons();

        Person myPerson = new Person();
        myPerson.setId("61201093350");
        myPerson.setName("Dimitri");
        myPerson.setSurname("Durmishian");

        // Check-in both you and one of the persons from the list
        Room otherPersonRoom = hotelManager.checkIn(persons.getFirst());

        Room myRoom = hotelManager.checkIn(myPerson);

        hotelManager.displayInfo();
    }
}
