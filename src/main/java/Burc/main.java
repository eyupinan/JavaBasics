package Burc;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;

        System.out.print("lütfen doğduğunuz ayı giriniz : ");
        month = input.nextInt();

        System.out.print("lütfen doğduğunuz günü giriniz : ");
        day = input.nextInt();

        if(month == 1){
            if(day <= 20){
                System.out.println("oğlak burcu");
            }else{
                System.out.println("kova burcu");
            }
        }
        else if(month == 2){
            if(day <= 18){
                System.out.println("kova burcu");
            }else{
                System.out.println("balık burcu");
            }
        }
        else if(month == 3){
            if(day >= 21){
                System.out.println("koç burcu");
            }else{
                System.out.println("balık burcu");
            }
        }
        else if(month == 4){
            if(day <= 20){
                System.out.println("koç burcu");
            }else{
                System.out.println("boğa burcu");
            }
        }
        else if(month == 5){
            if(day <= 20){
                System.out.println("boğa burcu");
            }else{
                System.out.println("ikizler burcu");
            }
        }
        else if(month == 6){
            if(day <=21){
                System.out.println("ikizler burcu");
            }else{
                System.out.println("yengeç burcu");
            }
        }
        else if(month == 7){
            if(day <=22){
                System.out.println("yengeç burcu");
            }else{
                System.out.println("aslan burcu");
            }
        }
        else if(month == 8){
            if(day <= 22){
                System.out.println("aslan burcu");
            }else{
                System.out.println("başak burcu");
            }
        }
        else if(month == 9){
            if(day <= 22){
                System.out.println("başak burcu");
            }else{
                System.out.println("terazi burcu");
            }
        }
        else if(month == 10){
            if(day <= 23){
                System.out.println("terazi burcu");
            }else{
                System.out.println("akrep burcu");
            }
        }
        else if(month == 11){
            if(day <= 22){
                System.out.println("akrep burcu");
            }else{
                System.out.println("yay burcu");
            }
        }
        else if(month == 12){
            if(day <= 21){
                System.out.println("yay burcu");
            }else{
                System.out.println("oğlak burcu");
            }
        }


    }
}
