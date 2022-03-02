package MinMax;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int adet,sayi, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        adet=input.nextInt();

        for (int i=1; i<=adet;i++){
            System.out.println(i+". Sayıyı giriniz: ");
            sayi=input.nextInt();
            min=(min>sayi)?sayi:min;
            max=(max<sayi)?sayi:max;
        }
        System.out.println("minimum değer:"+min);
        System.out.println("maximum değer:"+max);
    }
}
