package daire;

import java.util.Scanner;

public class main {
    public static double PI = 3.14;
    public static double cevre (double r){
        return 2* PI * r;
    }
    public static double alan (double r){
        return PI * Math.pow(r,2);
    }
    public static double dilimAlanı (double r,double dilimAcisi){
        return (PI * Math.pow(r,2)*dilimAcisi)/360;
    }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("yarıçap girin:");
        double r = input.nextDouble();
        System.out.println("daire dilim açısı girin:");
        double dilim = input.nextDouble();
        System.out.println("Çevre:"+cevre(r));
        System.out.println("Alan:"+alan(r));
        System.out.println("dilim alanı:"+dilimAlanı(r,dilim));

    }
}
