package Part3_Phone;

import Part3_Person.Person;

public class Main {
    public static void main(String[] args) {
       Phone xiaomi = new Phone();
        xiaomi.setModel("Xiaomi"); xiaomi.setNumber(2); xiaomi.setWeight(0.17);
        System.out.print("Model: "+xiaomi.getModel());
        System.out.print(", Number: "+xiaomi.getNumber());
        System.out.println(", Weight: "+xiaomi.getWeight());

        Phone caller = new Phone();
        caller.setCallnumber("0672248448");
        caller.receiveCall("Ant: ");
        System.out.println(caller.getCallnumber());

        Phone2 apple = new Phone2(1,"Apple", 0.13);
        System.out.println("\nModel: "+apple.getModel()+", Number: "+apple.getNumber()+", Weight: "+apple.getWeight());

    }
}
