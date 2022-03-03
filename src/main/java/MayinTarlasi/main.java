package MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static boolean isWin(int[][] map,String[][] mapVisual){
        for (int i=0;i<map.length;i++){
            for(int l =0; l< map[0].length;l++){
                if (map[i][l]==0){
                    if(mapVisual[i][l].equals("-")){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Random rand =new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("map yükseklik:");
        int height = input.nextInt();
        System.out.println("map genişlik:");
        int width = input.nextInt();
        int[][] map =new int[height][width];
        String[][] mapVisual =new String[height][width];
        int mayinSayisi = (height*width/4);
        for(int i =0;i<mapVisual.length;i++){
            for(int l =0; l<mapVisual[0].length;l++){
                mapVisual[i][l]="-";
                map[i][l]=0;
            }
        }
        for (int i=0;i<mayinSayisi;i++){
            while (true){
                int rHeight = rand.nextInt(height);
                int rWidth = rand.nextInt(width);
                if (map[rHeight][rWidth]==0){
                    map[rHeight][rWidth]=1;
                    break;
                }
            }
        }
        for(int[] i : map){
            for(int l : i){
                System.out.print(l+" ");
            }
            System.out.println();
        }
        while (true){
            for(String[] i : mapVisual){
                for(String l : i){
                    System.out.print(l+" ");
                }
                System.out.println();
            }
            System.out.println("Satır giriniz");
            int satir = input.nextInt();
            System.out.println("Sütun giriniz");
            int sutun = input.nextInt();
            if (mapVisual[satir][sutun].equals("-")){
                if (map[satir][sutun]==1){
                    System.out.println("Mayına bastınız!!!");
                    break;
                }
                else{
                    int count=0;

                    if (satir!=height-1){
                        if (sutun!=0) if(map[satir+1][sutun-1]==1) count++;
                        if(map[satir+1][sutun]==1) count++;
                        if(sutun!=width-1) if(map[satir+1][sutun+1]==1) count++;
                    }

                    if (sutun!=0) if(map[satir][sutun-1]==1) count++;
                    if(map[satir][sutun]==1) count++;
                    if(sutun!=width-1) if(map[satir][sutun+1]==1) count++;

                    if (satir!=0){
                        if (sutun!=0) if(map[satir-1][sutun-1]==1) count++;
                        if(map[satir-1][sutun]==1) count++;
                        if(sutun!=width-1) if(map[satir-1][sutun+1]==1) count++;
                    }
                    mapVisual[satir][sutun] = String.valueOf(count);
                    if (isWin(map,mapVisual)){
                        System.out.println("Kazandınız!!!!!!!!");
                        break;
                    }

                }
            }
        }
        for(String[] i : mapVisual){
            for(String l : i){
                System.out.print(l+" ");
            }
            System.out.println();
        }



    }
}
