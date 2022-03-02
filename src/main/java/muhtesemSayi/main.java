package muhtesemSayi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n, toplam=0;
        System.out.print("Bir sayı giriniz : ");
        n=input.nextInt();

        for (int i =1 ; i<=n/2;i++){
            if (n%i==0) toplam+=i;
        }
        if (toplam==n){
            System.out.println(" Mükemmel sayıdır.");
        }else{
            System.out.println(" Mükemmel sayı değildir.");
        }
    }
}
