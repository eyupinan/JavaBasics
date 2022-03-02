package AsalSayilar;

public class main {
    public static void main(String[] args) {
        for (int i =0;i<100;i++){
            boolean isPrime=true;
            for (int l = 2;l<=i/2;l++){
                if (i%l==0){
                    isPrime=false;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }

        }
    }
}
