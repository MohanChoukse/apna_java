// package apna_java.oops_22.topic;

// public class Get_Set {

//   public static void main(String[] args) {
//     Person p = new Person();
//     p.setName("Mohan");
//     System.out.println(p.getName() + " is a person.");
//     p.setAge(19);
//     System.out.println(p.getAge() + " years old");
//   }
// }

// class Person {
//   private String name;
//   private int age;

//   public void setName(String n) {
//     this.name = n;
//   }

//   public void setAge(int age) {
//     this.age = age;
//   }

//   public String getName() {
//     return this.name;
//   }

//   public int getAge() {
//     return this.age;
//   }
// }
package apna_java.oops_22.topic;

public class Get_Set {

  public static void main(String[] args) {
    Person p = new Person();
    p.setName("Mohan");
    System.out.println(p.getName() + " is a person.");
    p.setAge(16);
    System.out.println(p.getAge() + " years old");
  }
}

class Person {
  private String name;
  private int age;

  public void setName(String n) {
    this.name = n;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
}