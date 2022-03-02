package DeseneGoreMetod;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı girin:");
        int n =input.nextInt();
        System.out.print("desen: ");
        desen(n);
    }
    public static void desen(int n){
        System.out.print(n+" ");
        if (n>0) {
            desen(n-5);
        }
        else{
            return;
        }
        System.out.print(n+" ");
    }
}
