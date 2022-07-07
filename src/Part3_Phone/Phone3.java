package Part3_Phone;

public class Phone3 {
    private static int number = 3;
    private static String model = "Nokia";
    private static double weight = 0.1;

    public void setInformation(int number, String model, double weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    public static int getInformation1(){
        return number;
    }
    public static String getInformation2(){
        return model;
    }
    public static double getInformation3(){
        return weight;
    }
}
