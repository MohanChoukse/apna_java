package apna_java.oops_22.topic;

public class Copy_Constructor {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Mohan";
        p1.age = 19;
        p1.password = 1234;

        Person p2 = new Person(p1);

        System.out.println(p2.age);
    }
}

 class Person {

    String name;
    int age;
    int password;

    Person() {

    }

    Person(Person p) {

        this.name = p.name;
        this.age = p.age;

    }

}