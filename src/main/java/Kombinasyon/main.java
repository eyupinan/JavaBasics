package Kombinasyon;

import java.util.Scanner;

public class main {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int combination(int n,int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("n değeri girin");
        int n = input.nextInt();
        System.out.println("r değeri girin");
        int r = input.nextInt();
        System.out.println("kombinasyon:"+combination(n,r));
    }
}
