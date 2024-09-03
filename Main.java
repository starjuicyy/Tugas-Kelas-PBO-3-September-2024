/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModulPBOAbstrak;

/**
 *
 * @author Bintang
 */
public class Main {
    public static void main(String[] args) {
        Diskonable produk1 = new Smartphone("iPhone 14", 15000000, 50, 6.1);
        System.out.println("Diskon untuk " + produk1.getClass().getSimpleName() + ": Rp" + produk1.hitungDiskon());

        Diskonable produk2 = new Laptop("MacBook Pro", 25000000, 20, "Intel Core i9", 32);
        System.out.println("Diskon untuk " + produk2.getClass().getSimpleName() + ": Rp" + produk2.hitungDiskon());
    }
}

