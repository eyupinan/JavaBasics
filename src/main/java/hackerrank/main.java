package hackerrank;

import java.util.*;
public class main {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length()!=b.length()){
            return false;
        }
        for (int i = 0 ;i<a.length();i++){
            char charCheck = a.charAt(i);
            int frequency1 =0,frequency2=0;
            for (int l =0;l<a.length();l++){
                if (charCheck==a.charAt(l)){
                    frequency1++;
                }
                if (charCheck==b.charAt(l)){
                    frequency2++;
                }
            }
            if (frequency1!=frequency2){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int a =20 ,b=10;
        if ((a>b) && (b++<25)){
            System.out.println(a);
        }

        else{
            System.out.println(a);
        }
        System.out.println(b);

    }
}