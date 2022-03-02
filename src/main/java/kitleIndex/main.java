package kitleIndex;

import java.util.Scanner;

public class main {
    public enum prices{
        ARMUT(2.14),
        ELMA(3.67),
        DOMATES(1.11),
        MUZ(0.95),
        PATLICAN(5);
        private final double price;

        private prices(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double armut,elma,domates,muz,patlıcan , tutar ;
        System.out.print("Armut kaç kilo? : ");
        armut = input.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        elma = input.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        domates = input.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        muz = input.nextDouble();
        System.out.print("Patlıcan kaç kilo? : ");
        patlıcan = input.nextDouble();
        tutar = armut * prices.ARMUT.getPrice()+elma*prices.ELMA.getPrice()+domates*prices.DOMATES.getPrice()
                + muz*prices.MUZ.getPrice()+patlıcan*prices.PATLICAN.getPrice();
        System.out.println("Tutar:"+tutar);

    }
}
