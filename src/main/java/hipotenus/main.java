package hipotenus;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int k1,k2,k3,cevre;
        double u , alan;
        System.out.print("1. kenar uzunluğunu girin : ");
        k1 = input.nextInt();
        System.out.print("2. kenar uzunluğunu girin : ");
        k2 = input.nextInt();
        System.out.print("3. kenar uzunluğunu girin : ");
        k3 = input.nextInt();
        cevre = k1+k2+k3;
        System.out.println("üçgenin çevresi : " + cevre);

        u = cevre / 2;
        alan = Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));
        System.out.println("Üçgenin alanı : " + alan);
    }
}
