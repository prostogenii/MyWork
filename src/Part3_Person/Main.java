package Part3_Person;

public class Main {
    public static void main(String[] args) {
        Person personX = new Person();
        personX.age = 20;
        personX.fullName = "Boby";
        Person personY = new Person("Andrey",17);
        System.out.println(personX.fullName+" "+personX.age);
        System.out.println(personY.fullName+" "+personY.age);
        Person.move();
        Person.talk();
    }
}
