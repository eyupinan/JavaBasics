package hesapmakinesi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk değeri giriniz:");
        double n1 = input.nextDouble();
        System.out.println("ikinci değeri giriniz:");
        double n2 = input.nextDouble();
        System.out.println("operatör:\n1)Toplama\n2)çıkarma\n3)çarpma\n4)bölme");
        System.out.println("Seçiminiz:");
        int yontem = input.nextInt();
        switch (yontem){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                try{
                    System.out.println(n1/n2);
                }
                catch (Exception e){
                    System.out.println("0'a bölme işlemi yapılamaz.");
                }
                break;
            default:
                System.out.println("yanlış bir seçim yaptınız");
        }
    }
}
