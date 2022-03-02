package NotOrtalamasi;

import java.util.Scanner;

public class main {
    public static float mean_calculator(int mat,int fizik,int kimya,int turkce,int tarih,int muzik){
        return (mat+ fizik + kimya + turkce + tarih + muzik)/6f;
    }
    public static void main(String[] args){
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        float mean = mean_calculator(mat,fizik,kimya,turkce,tarih,muzik);
        System.out.println("Ortalamanız :"+mean);
        String durum = (mean < 60) ? "Kaldınız!" : "Tebrikler geçtiniz!";
        System.out.println(durum);
    }
}
