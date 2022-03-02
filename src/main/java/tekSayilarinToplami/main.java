package tekSayilarinToplami;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total =0;
        while (true){
            int inp = input.nextInt();
            if (inp<0){
                break;
            }
            if (inp%2!=0){
                total+=inp;
            }
        }
        System.out.println("toplam değeri:"+total);
    }
}
