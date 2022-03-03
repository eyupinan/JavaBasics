package YakinSayi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = input.nextInt();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i:list){
            if (i<min) min=i;
            if (i>max) max=i;
        }
        for(int i : list){
            if ((sayi-i>=0) && ((sayi-i)<(sayi-min))){
                min=i;
            }
            if ((i-sayi>=0) && ((i-sayi)<(max-sayi))){
                max=i;
            }

        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }
}
