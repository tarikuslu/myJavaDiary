/*
package examples;
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isZero = true;
        int kalan;
        System.out.println("Bir sayı giriniz..");
        int girilenSayi = scanner.nextInt();

            for (int i = 1; i<=girilenSayi; i++){
                if (i == 1){
                    System.out.println("1 sayısı asal değildir");
                }
                else if(i == 2) {
                    System.out.println("2 sayısı asaldır");
                }
                for (int j=2; j<i; j++) {
                        kalan = i%j;
                        if (kalan == 0){
                            isZero = true;
                            System.out.println(  i + " sayısı asal değildir");
                            break;
                        }
                        else {
                            isZero = false;
                        }
                }
                if (isZero == false){
                    System.out.println(i + " sayısı asaldır");
                }
                kalan = 0;
                isZero = false;
            }

        }


    }



 */
