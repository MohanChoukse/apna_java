package apna_java.oops_22.topic;

class Bank {

    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    void lol() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d + "\n");

    }

}

class savingBank extends Bank {
    void dispaly() {
        // System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d + "\n");
    }
}

public class Access_Modifiers {

    public static void main(String[] args) {

        Bank e = new Bank();
        // System.out.println(e.a);
        System.out.println(e.b);
        System.out.println(e.c);
        System.out.println(e.d + "\n");
        e.lol();
        savingBank r = new savingBank();
        r.dispaly();

    }
}
