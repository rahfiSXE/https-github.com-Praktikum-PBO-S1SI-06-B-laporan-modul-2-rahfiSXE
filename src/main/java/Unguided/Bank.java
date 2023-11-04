package Unguided;

class Bank {
    private double saldo;
    // Konstruktor dengan parameter saldo
    public Bank(double saldo) {
        this.saldo = saldo;
    }
    // Method untuk simpan uang
    public void simpanUang(double jumlah) {
        saldo += jumlah;
    }
    // Method untuk ambil uang
    public void ambilUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }
    // Method untuk mendapatkan saldo
    public double getSaldo() {
        return saldo;
    }
}

