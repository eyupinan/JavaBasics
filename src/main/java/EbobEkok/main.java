package EbobEkok;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı girin:");
        int n1 = input.nextInt();
        System.out.println("ikinci sayıyı girin:");
        int n2 = input.nextInt();
        int ebob=1, ekok;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i == 0 && n2 % i == 0)
                ebob = i;
        }

        ekok = (n1 * n2) / ebob;
        System.out.println(n1 +" ve "+n2+ " sayılarının ebob'u:"+ebob);
        System.out.println(n1 +" ve "+n2+ " sayılarının ekok'u:"+ekok);
    }
}
