package Part3_Phone;

public class Phone2 {
    private int number;
    private String model;
    private double weight;
    private String callnumber;

    Phone2(int number, String model, double weight){
        this.number = number;
        this.model = model;
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
