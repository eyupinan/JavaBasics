package degerTekrari;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,6,-2,3,6,9,17,34,2,34,17,18,21,5,17};
        List<Integer> used= new ArrayList<>();
        for (int i: array){
            if (used.contains(i)){
                continue;
            }
            else{
                int count =0;
                for (int l: array){
                    if (l==i){
                        count++;
                    }
                }
                System.out.println(i+" değeri tekrar sayısı:"+count);
                used.add(i);
            }
        }
    }
}
