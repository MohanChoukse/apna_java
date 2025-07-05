 package apna_java.condition_Statement11.my;


public class condition {

  public static void main(String[] args) {
    // find largest of 2 number
    // int a=1, b=2;
    // if (a>b) {
    //     System.out.println(a);
    // }
    // System.out.println(b);

    // find even or odd
    // int a =2;
    // if(a%2!=0){
    //     System.out.println("Even");
    // }else{
    //     System.out.println("Odd");
    // }

    // 3 largest number
    // int a =22, b=22, c=22;
    // if (a >= b && a>=c) {
    //     System.out.println("a"+a);
    // }else if (b>=a && b>=c) {
    //     System.out.println("b"+b);
    // }else {
    //     System.out.println("c"+c);
    // }

    // student pass or fail using trenary opreater
    // int mask =150;
    // String a = (mask>=33)? "pass": "fail";
    // System.out.println(a);

    int year = 22;
    boolean a = year % 4 == 0;
    boolean b = year % 100 != 0;
    boolean c = year % 100 == 0 && year % 400 == 0;

    if (a && (b || c)) {
      System.out.println("its leep year");
    } else {
      System.out.println("not a leep year");
    }
  }
}
