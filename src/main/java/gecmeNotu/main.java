package gecmeNotu;

import java.util.Scanner;

public class main {
    public static float mean_calculator(int mat,int fizik,int kimya,int turkce,int muzik){
        int count = 5;
        int total =0;
        if (mat>=0 && mat<=100) total+=mat;
        else count--;
        if (fizik>=0 && fizik<=100) total+=fizik;
        else count--;
        if (kimya>=0 && kimya<=100) total+=kimya;
        else count--;
        if (turkce>=0 && turkce<=100) total+=turkce;
        else count--;
        if (muzik>=0 && muzik<=100) total+=muzik;
        else count--;
        return total/count;
    }
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        float mean = mean_calculator(mat,fizik,kimya,turkce,muzik);
        System.out.println("Ortalamanız :"+mean);
        String durum = (mean < 55) ? "Kaldınız!" : "Tebrikler geçtiniz!";
        System.out.println(durum);
    }
}
