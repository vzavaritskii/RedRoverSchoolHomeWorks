package HW_8;

public class Person {
    String name;
    int age;
    String sex;

    public static String getName (Person person) {
        return (person.sex.equals("man") ? "Mr. " : "Mrs. ") + person.name;
    }
}


