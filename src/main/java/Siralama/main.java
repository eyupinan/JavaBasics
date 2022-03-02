package Siralama;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("girilecek sayı adedini girin:");
        int count =  input.nextInt();
        Integer[] list = new Integer[count];
        for (int i=0;i<count;i++){
            list[i]=input.nextInt();
        }
        for (int i=0;i<list.length-1;i++){
            int min = list[i];
            int min_index=i;
            for (int l = i; l<list.length;l++ ){
                if (list[l]<min){
                    min_index=l;
                    min=list[l];
                }
            }
            int buffer = list[i];
            list[i]=list[min_index];
            list[min_index]=buffer;
        }
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }

}
