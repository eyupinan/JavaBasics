package tersUcgen;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = input.nextInt();
        for (int i=(n%2==0)? n-1 : n;i>=1;i-=2){
            int start = (n-i)/2;
            for (int l=0;l<n;l++){
                if (l<start || l>=(start+i))System.out.print(" ");
                else System.out.print("*");

            }
            System.out.println();
        }
    }
}
