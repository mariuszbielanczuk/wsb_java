package zad_dodatkowe01;

import java.util.Random;

public class Person {

    String firstName;
    String lastName;

    public String getFullName() {
        String fullName = firstName;
        if (firstName != "" && lastName != "") {
            fullName += " ";
        }
        fullName += lastName;
        return fullName;
    }

    public static Person constructPerson(String firstName, String lastName) {
        Person person = new Person();
        person.firstName = firstName;
        person.lastName = lastName;
        return person;
    }
}
