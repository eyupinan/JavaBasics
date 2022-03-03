package palindrom;

import java.util.Scanner;

public class main {
    public static boolean  isPalindrom(int num){

        int temp = num,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber= temp %10;
            reverseNumber = (reverseNumber*10)+lastNumber;
            temp /=10;
        }
        return num == reverseNumber;

    }
    public static boolean  isPalindromString(String s){

        int end;
        if (s.length()%2==0) end = s.length()/2;
        else end = (s.length()-1)/2;
        boolean isPalindrom=true;
        for (int i =0;i<end;i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                isPalindrom=false;
            }
        }
        return isPalindrom;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int n= input.nextInt();
        System.out.println(isPalindrom(n));
    }

}
