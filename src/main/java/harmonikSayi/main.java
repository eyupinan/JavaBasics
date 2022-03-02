package harmonikSayi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double toplam=0;

        System.out.print("n değerini giriniz: ");
        int n= input.nextInt();
        input.close();

        for(int i=1 ; i<=n; i++){
            toplam=toplam + 1.0/i;
        }
        System.out.printf("Sonuç : "+ toplam);


    }
}
