package forPower;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("taban değeri girin");
        int taban = input.nextInt();
        System.out.println("üs değeri girin:");
        int us = input.nextInt();
        int deger =1;
        for (int i=0;i<us;i++){
            deger*=taban;
        }
        System.out.println("sonuç:"+deger);
    }
}
