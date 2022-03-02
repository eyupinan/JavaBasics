package SayiBasamaklari;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı girin:");
        int deger = input.nextInt();
        int toplam=0;
        String stringValue = String.valueOf(deger);
        for (int i=0;i<stringValue.length();i++){
            toplam+=Integer.valueOf(String.valueOf(stringValue.charAt(i)));
        }
        System.out.println("basamakları toplamı:"+toplam);
    }
}
