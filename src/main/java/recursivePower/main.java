package recursivePower;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("sayiyi girin:");
        int sayi = input.nextInt();
        System.out.println("üs değerini girin:");
        int us = input.nextInt();
        System.out.println(power(sayi,us));
    }
    public static int power(int sayi,int us){
        if (us==0){
            return 1;
        }
        else{
            return sayi*power(sayi,us-1);
        }
    }
}
