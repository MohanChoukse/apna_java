package apna_java.oops_22.topic;

public class constructors {

    public static void main(String[] args) {

        Person p = new Person(23);
        System.out.println((int)p.a);

    }
}

class Person {
    int a;
    int b;

    class lol {
        void dis() {
            System.out.println("lol");
        }
    }

  public  Person(int a) {

        this.a = a;
    }
}