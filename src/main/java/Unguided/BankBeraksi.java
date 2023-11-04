package Unguided;

public class BankBeraksi {
    public static void main(String[] args) {
        // Membuat objek Bank dengan saldo awal Rp. 100000
        Bank bankABC = new Bank(100000);
        // Menampilkan pesan selamat datang dan saldo awal
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());
        // Simpan uang sejumlah Rp. 500000
        bankABC.simpanUang(500000);
        System.out.println("\nSimpan uang: Rp. 500000");
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());
        // Ambil uang sejumlah Rp. 150000
        bankABC.ambilUang(150000);
        System.out.println("\nAmbil uang: Rp. 150000");
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());
    }
}
