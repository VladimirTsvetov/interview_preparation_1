package personbuilder;

public class Main {
    public static void main(String[] args) {
        
        Person person = new Person
                .Builder()
                .withFirstName("Василий")
                .withLastName("Чапаев")
                .withMiddleName("Иванович")
                .withAddress("река Урал")
                .withAge(32)
                .withCountry("Россия")
                .withGender("брутальный мужик")
                .build();

        System.out.println(person);


    }
}
