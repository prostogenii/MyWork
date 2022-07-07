package Part3_Phone;

public class Phone {
    private int number;
    private String model;
    private double weight;
    private String callnumber;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setCallnumber(String callnumber){
        this.callnumber=callnumber;
    }
    public String getCallnumber(){
        return callnumber;
    }
    public void receiveCall(String nameofcall){
        System.out.print("Телефонує "+nameofcall);
    }

}
