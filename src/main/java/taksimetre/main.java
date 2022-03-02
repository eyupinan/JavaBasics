package taksimetre;

import java.util.Scanner;

public class main {
    public static float priceCalculator(float mesafe){
        float init = 10f;
        float price = init + mesafe * 2.2f;
        return (price>20) ? price : 20;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float mesafe = input.nextFloat();
        float price = priceCalculator(mesafe);
        System.out.println("Price : "+ price);
    }

}
