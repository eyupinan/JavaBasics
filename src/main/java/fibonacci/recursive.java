package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("limit değeri girin: ");
        int n = input.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if (n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }
}
