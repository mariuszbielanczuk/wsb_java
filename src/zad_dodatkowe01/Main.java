package zad_dodatkowe01;

public class Main {

    public static void main(String[] args) {

        String[] firstNames = {
                "James",
                "John",
                "Jane",
                "Ted",
                "Mike",
                "Monica",
                "Lisa",
                "Mary",
                "Linda",
                "Edmundo",
                "Maria",
                "Diego",
                "Jessica"};

        String[] lastNames = {
                "Smith",
                "Johnson",
                "Williams",
                "Brown",
                "Jones",
                "Garcia",
                "Miller",
                "Davis",
                "Rodriguez",
                "Martinez",
                "Hernandez",
                "Lopez",
                "Gonzalez",
                "Wilson",
                "Anderson"};

/*        //generate a list of persons manually
        Person[] persons = {
                Person.constructPerson("John", "Doe"),
                Person.constructPerson("Johny", ""),
                Person.constructPerson("", "Wick"),
                Person.constructPerson("", "")
        };*/

        //generate a list of random persons from firstNames and lastNames
        int numberOfPersons = 50;
        Person[] randomPersons = new Person[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            //generate random index for firstNames
            int randomIndexFirstName = (int) Math.floor(Math.random() * (firstNames.length));
            //generate random index for lastNames
            int randomIndexLastName = (int) Math.floor(Math.random() * (lastNames.length));
            //generate random name
            randomPersons[i] = Person.constructPerson(firstNames[randomIndexFirstName], lastNames[randomIndexLastName]);
        }

/*        System.out.println("\nContents of 'persons':");
        for (Person person : persons) {
            System.out.println(person.getFullName());
        }*/
        System.out.println("\nContents of 'randomPersons':");
        for (Person person : randomPersons) {
            System.out.println(person.getFullName());
        }

        familyMembers("Rodriguez", randomPersons);
        familyMembers("Kowalski", randomPersons);

    }

    public static void familyMembers(String lastName, Person[] persons) {
        boolean personFound = false;
        System.out.printf("\nMembers of %s family:\n", lastName);
        for (Person person : persons) {
            if (person.lastName == lastName) {
                System.out.println(person.getFullName());
                personFound = true;
            }
        }
        if (personFound == false) {
            System.out.printf("None");
        }
    }
}
