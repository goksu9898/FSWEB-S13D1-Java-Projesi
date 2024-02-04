package sprint1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //shouldWakeUp (true, 1); => true dönmeli(Gece 1'de köpeğimiz havlıyor)
        //shouldWakeUp (false, 2); => false dönmeli.(köpek havlamıyor.)
        //shouldWakeUp (true, 8); => false dönmeli.(8'den sonra ise tepki vermeliyiz.)
        //shouldWakeUp (true, -1); => false dönmeli(-1 geçersiz değer)

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("*****************************************");

        //hasTeen(9, 99, 19); => true dönmeli.(19 değerinden dolayı)
        //hasTeen(23, 15, 42); => true dönmeli.(15 değerinden dolayı)
        //hasTeen(22, 23, 34); => false dönemli(Hiçbir değer 13-19 arasında değil.)

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("*****************************************");

        //isCatPlaying(true, 10); => false dönmeli(sıcaklık 25-45 arasında olmalıydı)
        //isCatPlaying(false, 36); => false dönmeli(sıcaklık 25-35 arasında olmalıydı)
        //isCatPlaying(false, 35); => true dönmeli(sıcaklık 25-35 arasında.)

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("*****************************************");
        System.out.println("dikdörtgen alanı hesaplamak için lütfen kenarları giriniz");

        Scanner in = new Scanner(System.in);

        double kenar1 = in.nextDouble();
        double kenar2 = in.nextDouble();
        System.out.println(area(kenar1, kenar2));
        System.out.println("*****************************************");

        System.out.println("daire alanı hesaplamak için lütfen yarıçap giriniz");
        double radius = in.nextDouble();
        System.out.println(area(radius));
    }

    public static boolean shouldWakeUp(boolean hasBarked, int hour) {
        if (hasBarked) {
            if (hour < 0 || hour > 23) {
                return false;
            } else if (hour > 20 || hour < 8) {
                return true;
            } else
                return false;
        } else
            return false;
    }

    public static boolean hasTeen(int param1, int param2, int param3) {
        if ((13 <= param1 && param1 <= 19) || (13 <= param2 && param2 <= 19) || (13 <= param3 && param3 <= 19)) {
            return true;
        } else
            return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int heat) {
        if (isSummer) {
            if (heat <= 45 && heat >= 25) {
                return true;
            } else
                return false;
        } else {
            if (heat >= 25 && heat <= 35) {
                return true;
            } else
                return false;
        }
    }

    public static double area(double kenar1, double kenar2) {

        if (kenar1 < 0 || kenar2 < 0) {
            return -1;
        } else
            return kenar1 * kenar2;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else
            return radius * radius * Math.PI;
    }


}