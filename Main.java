/*Vücut Kitle İndeksi Hesaplama

Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül:

Kilo (kg) / Boy(m) * Boy(m)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        double boy, kilo, netice;
        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Metre Olarak Giriniz: ");
        boy= input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo= input.nextDouble();

        netice=kilo/(boy*boy);

        System.out.println("Vücut Kitle Endeksiniz= "+netice);


    }

}
