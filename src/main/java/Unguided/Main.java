package Unguided;

import java.util.Scanner;

class Titik {
    private int x;
    private int y;

    public Titik() {
        x = 0;
        y = 0;
    }

    public void inisialisasiTitik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void tampilTitik() {
        System.out.println("Titik: (" + x + ", " + y + ")");
    }

    public void perkalihanSkalar(int skalar) {
        x *= skalar;
        y *= skalar;
    }

    public void pencerminanSumbuX() {
        y = -y;
    }

    public void pencerminanSumbuY() {
        x = -x;
    }

    public double jarak(Titik t2) {
        int x2 = t2.x;
        int y2 = t2.y;
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Titik titik = new Titik();
        int pilihan;
        do {
            System.out.println("\nMENU OPERASI TITIK");
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIHAN SKALAR TITIK");
            System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. KELUAR");
            System.out.print("MASUKAN PILIHAN: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai x: ");
                    int x = input.nextInt();
                    System.out.print("Masukkan nilai y: ");
                    int y = input.nextInt();
                    titik.inisialisasiTitik(x, y);
                    break;
                case 2:
                    titik.tampilTitik();
                    break;
                case 3:
                    System.out.print("Masukkan nilai skalar: ");
                    int skalar = input.nextInt();
                    titik.perkalihanSkalar(skalar);
                    break;
                case 4:
                    titik.pencerminanSumbuX();
                    break;
                case 5:
                    titik.pencerminanSumbuY();
                    break;
                case 6:
                    System.out.print("Masukkan koordinat Titik kedua (x2): ");
                    int x2 = input.nextInt();
                    System.out.print("Masukkan koordinat Titik kedua (y2): ");
                    int y2 = input.nextInt();
                    Titik t2 = new Titik();
                    t2.inisialisasiTitik(x2, y2);
                    double jarak = titik.jarak(t2);
                    System.out.println("Jarak antara dua Titik: " + jarak);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        input.close();
    }
}

