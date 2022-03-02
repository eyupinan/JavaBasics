package AsalSayilar;

import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number Enter:");
        int n= input.nextInt();
        System.out.println(isPrime(n,2)? "prime":"not prime");
    }
    public static boolean isPrime(int n,int i){
        if (n==1){
            return false;
        }
        if (n%i==0){
            return false;
        }
        else{
            if (i+1>n/2){
                return true;
            }
            return isPrime(n,i+1);
        }
    }
}
