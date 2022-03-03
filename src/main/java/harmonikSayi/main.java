package harmonikSayi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double toplam=0;

        System.out.print("n değerini giriniz: ");
        int n= input.nextInt();
        input.close();

        for(int i=1 ; i<=n; i++){
            toplam=toplam + 1.0/i;
        }
        System.out.printf("Sonuç : "+ toplam);

        // dizileri kullanarak yapılan
        Integer[] array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.printf("Sonuç : "+ fromArray(array1));


    }
    public static double fromArray(Integer[] array){
        double total = 0 ;
        for(int i : array) {
            total += ( 1.0 / i ) ;
        }
        return total ;
    }
}
