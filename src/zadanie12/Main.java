package zadanie12;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFullName() {
        return String.format("Full name is %s %s", firstName, lastName);
    }

    public int getBirthYear() {
        return LocalDate.now().getYear() - birthYear;
    }

}

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski", 1979);
        System.out.println(person1.getFullName());
        System.out.println("Age is " + person1.getBirthYear());
        person1.setBirthYear(1980);
        System.out.println("Age is " + person1.getBirthYear());
    }
}
