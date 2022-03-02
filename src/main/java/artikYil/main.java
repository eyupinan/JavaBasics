package artikYil;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz:");
        int yil = input.nextInt();
        if (yil%4==0){
            if (yil%100==0){
                if (yil%400==0){
                    System.out.println(yil+" bir artık yıldır!");
                }
                else{
                    System.out.println(yil+" bir artık yıl değildir!");
                }
            }
            else{
                System.out.println(yil+" bir artık yıldır!");
            }
        }
        else{
            System.out.println(yil+" bir artık yıl değildir!");
        }
    }
}
