package DonguKuvvet;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Limit değeri girin");
        int limit = input.nextInt();
        System.out.println("4'ün katları:");
        for (int i=4;i<limit;i*=4){
            System.out.println(i);
        }
        System.out.println("5'ün katları:");
        for (int i=5;i<limit;i*=5){
            System.out.println(i);
        }
    }
}
