package forTamBolen;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int count3=0;
        int count4=0;
        int total3=0;
        int total4=0;
        for (int i=1;i<limit;i++){
            if (i%3==0){
                count3++;
                total3+=i;
            }
            if (i%4==0){
                count4++;
                total4+=i;
            }
        }
        System.out.println("3'e bölünenlerin ortalaması: " + total3/count3);
        System.out.println("4'e bölünenlerin ortalaması: " + total4/count4);
    }
}
