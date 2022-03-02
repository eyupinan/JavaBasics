package fibonacci;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("limit değeri girin: ");
        int n = input.nextInt();

        int n1=0,n2=1,buffer;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");

        for (int i=0; i<n-2; i++) {
            buffer = n2;
            n2 += n1;
            n1 = buffer;
            System.out.print(n2 + " ");
        }
    }
}
