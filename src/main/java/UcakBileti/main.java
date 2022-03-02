package UcakBileti;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("mesafeyi km cinsinden giriniz:");
        double mesafe = input.nextDouble();
        System.out.println("yaşınızı giriniz:");
        int  yas = input.nextInt();
        System.out.println("tek yön için 1 çift yön için 2 yazın:");
        int  tip = input.nextInt();
        if (mesafe<=0 || yas<0 || (tip!=1 && tip!=2)){
            System.out.println("yanlış bilgi girdiniz!");
        }
        else{
            double mainPrice = mesafe*0.1;
            double yasIndirimi =0;
            double yonIndirimi =0;
            if (yas<12){
                yasIndirimi= mainPrice*0.5;
            }
            else if (yas>=12 && yas<=24){
                yasIndirimi= mainPrice*0.1;
            }
            else if (yas>65){
                yasIndirimi= mainPrice*0.3;
            }
            double indirimliFiyat =  mainPrice-yasIndirimi;
            if (tip==2){
                indirimliFiyat = (indirimliFiyat - indirimliFiyat*0.2)*2;

            }
            System.out.println("Toplam tutar : "+indirimliFiyat);

        }

    }
}
