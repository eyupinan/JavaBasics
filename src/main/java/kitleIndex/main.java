package kitleIndex;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double kilo,boy,index ;
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("boyunuzu meetre cinsinden giriniz: ");
        boy = input.nextDouble();
        index = kilo / Math.pow(boy,2);
        System.out.println("Vücut kitle indeksiniz : " + index);
    }
}
