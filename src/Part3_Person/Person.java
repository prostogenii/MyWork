package Part3_Person;

public class Person {
    String fullName;
    int age;

    Person(){
    }

    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public static void move(){
        System.out.println("Person moves");
    }
    public static void talk(){
        System.out.println("Person talk");
    }
}
