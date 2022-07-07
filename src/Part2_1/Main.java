package Part2_1;

public class Main {
    public static void main(String[] args) {
        String[] x = new String[]{"I love Java!"};
        for(int i=0;i<x.length;i++){
            char element = (char) i;
            if(element=='a'||element=='e'){
                System.out.print("+");
            }else{
                System.out.print("-");
            }
        }
    }
}
