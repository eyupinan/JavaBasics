package KDV;

import java.util.Scanner;

public class main {
    public static float kdvHesapla(float price){
        float kdv = (price<=1000) ? 0.18f : 0.08f;
        return kdv;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int productPrice;
        System.out.print("Lütfen ürün fiyatı giriniz ");
        productPrice = inp.nextInt();

        float kdvTutari = kdvHesapla(productPrice)*productPrice;
        System.out.println("KDV tutarı = " + kdvTutari);

        System.out.println("KDV'li fiyat = " +(productPrice+kdvTutari));
    }
}
