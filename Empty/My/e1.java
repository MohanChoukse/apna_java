


// public class e1 {
//     public static void main(String[] args) {
//         String a = "mohan lol";
//         System.out.println(a);
//     }
// }




class calculor1 {

    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

}

class first {

    int a = 12;

    void myName() {
        System.out.println("mohan");
    }
}

class sirName extends first {

    @Override
    void myName() {
        System.out.println("Chouksey");
    }
}

public class e1 {

    public static void main(String[] args) {

        // 1
        calculor1 obj = new calculor1();
        int a = obj.add(10, 20);

        System.out.println(a);

        System.out.println(obj.sub(1, 2));

        first obj3 = new first();
        obj3.myName();
        sirName obj2 = new sirName();
        obj2.myName();
        System.out.println(obj2.a);

    }
}
