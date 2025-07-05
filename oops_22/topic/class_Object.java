package apna_java.oops_22.topic;

public class class_Object {


    public static void main(String[] args) {
       Student ob = new Student();
       ob.setName("Mohan");
        System.out.println(ob.name);
        ob.setAge(18);
        System.out.println(ob.age);
        ob.age=19;
        System.out.println(ob.age);

    }
}


class Student{
    String name;
    int age;

    void setName(String n){
        name = n;
    }

    void setAge(int a){
        age = a;
    }
}