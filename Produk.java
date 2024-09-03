/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModulPBOAbstrak;

/**
 *
 * @author Bintang
 */
interface Diskonable {
    double hitungDiskon();
}

abstract class Produk implements Diskonable {
    protected String namaProduk;
    protected double harga;
    protected int jumlahStok;

    public Produk(String namaProduk, double harga, int jumlahStok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.jumlahStok = jumlahStok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + jumlahStok);
    }
}

class Smartphone extends Produk {
    private double ukuranLayar;

    public Smartphone(String namaProduk, double harga, int jumlahStok, double ukuranLayar) {
        super(namaProduk, harga, jumlahStok);
        this.ukuranLayar = ukuranLayar;
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.1; // Diskon 10%
    }
}

class Laptop extends Produk {
    private String prosesor;
    private int kapasitasRAM;

    public Laptop(String namaProduk, double harga, int jumlahStok, String prosesor, int kapasitasRAM) {
        super(namaProduk, harga, jumlahStok);
        this.prosesor = prosesor;
        this.kapasitasRAM = kapasitasRAM;
    }

    @Override
    public double hitungDiskon() {
        // Logika diskon berdasarkan spesifikasi laptop
        return harga * 0.15; // Contoh: diskon 15%
    }
}

class Tablet extends Produk {
    private String resolusiKamera;
    private String sistemOperasi;

    public Tablet(String namaProduk, double harga, int jumlahStok, 
                  String resolusiKamera, String sistemOperasi) {
        super(namaProduk, harga, jumlahStok);
        this.resolusiKamera = resolusiKamera;
        this.sistemOperasi = sistemOperasi;
    }

    // Implementasi metode hitungDiskon() dan getter/setter

    @Override
    public double hitungDiskon() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

