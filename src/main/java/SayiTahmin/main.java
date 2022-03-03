package SayiTahmin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int wrong = 0;
        int selected;


        System.out.println(number);
        while (wrong < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();
            if (selected != number) {
                wrong++;
                if (wrong>=5){
                    System.out.println("Hakkınız kalmadı!");
                }
                else{
                    System.out.println("Tahmininiz yanlış kalan hakkınız:" + (5 - wrong));
                    System.out.println("tekrar deneyiniz");
                }

            }
            else{
                System.out.println("Doğru cevap!!!");
                break;
            }
        }


    }
}
