package userLogin;

import java.util.Scanner;

public class main {
    public static String username ="patika";
    public static String password = "java123";
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("username girin:");
        String receivedUserName = input.next();
        System.out.println("şifre girin:");
        String receivedPassword = input.next();
        if (receivedUserName.equals(username) && receivedPassword.equals(password)){
            System.out.println("login başarı ile gerçekleştirildi!");
        }
        else{
            System.out.println("şifre veya kullanıcı adı hatalı!");
            System.out.println("şifreyi sıfırlamak istermisiniz ?\n Sıfırlamak için 1 çıkış yapmak için 0 yazın: ");
            int boo = input.nextInt();
            if (boo!=0){
                System.out.println("yeni şifregyi girin:");
                while (true){
                    String newPassword = input.next();
                    if (!newPassword.equals(password)){
                        password=newPassword;
                        System.out.println("şifr başarı ile güncellendi");
                        break;
                    }
                    System.out.println("başka bir şifre deneyiniz");
                }

            }
        }
    }
}
