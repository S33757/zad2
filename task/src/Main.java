import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoj wiek:");
        int wiek = sc.nextInt();
        System.out.println("Podaj swoje miasto zamieszkania:");
        String miasto = sc.next();
        System.out.println("Podaj dzien tygodnia:");
        String dzien = sc.next();

        System.out.println("Twoja znizka wynosi:");
        int calaZnizka = znizkaWiek(wiek) + znizkaMiasto(miasto) + znizkaDzien(dzien);

        if (calaZnizka > 100) {
            calaZnizka = 100;
        }
        System.out.println("Zniżka: " + calaZnizka + "%");

        int BasePrice = 40;

        int CenaBiletu = BasePrice * (100 - calaZnizka) / 100;
        System.out.println("Cena biletu wynosi: " + CenaBiletu);
    }

    public static int znizkaWiek(int wiek) {
        int znizkaWiek = 0;
        if (wiek < 10) {
            znizkaWiek = 100;
        } else if (wiek >= 10 && wiek <= 18) {
            znizkaWiek = 50;
        } else {
            znizkaWiek = 0;
        }
        return znizkaWiek;
    }

    public static int znizkaMiasto(String miasto) {
        int znizkaMiasto = 0;
        if (miasto.equals("Warszawa")) {
            znizkaMiasto = 10;
        }
        return znizkaMiasto;
    }

    public static int znizkaDzien(String dzien) {
        int znizkaMiasto = 0;
        if (dzien.equals("Czwartek")) {
            znizkaMiasto = 100;
        }
        return znizkaMiasto;
    }
}
