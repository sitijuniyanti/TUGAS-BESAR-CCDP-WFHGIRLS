/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanadia
 */
public class Main {
    public static void main(String[] args){
        
        Pelanggan resto = new NamaPelanggan();
        
        Pelanggan pelangganPertama = new AlamatDecoratorPelanggan(new NamaPelanggan());
        
        Pelanggan pelangganKedua = new AlamatDecoratorPelanggan(new OrderanPelanggan());
        
        System.out.println("Pesanan 1");
        resto.pesan();
        
        System.out.println("\nPesan apa?");
        pelangganPertama.pesan();
        
        System.out.println("\nSiap di hidangkan untuk Pelanggan Vanadia Aviandi");
        pelangganKedua.pesan();
    }
}
