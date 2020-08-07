/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Vanadia
 */
public class PelangganDemo {
    public static void main(String[] args){
        Pelanggan nama = new Pelanggan("Vanadia Aviandi");
        Pelanggan alamat = new Pelanggan("Ciroyom");
        Pelanggan orderan = new Pelanggan("Ayam");
        
        Pelanggan nama2 = new Pelanggan("Siti Junianty");
        Pelanggan alamat2 = new Pelanggan("Sekeloa");
        Pelanggan orderan2 = new Pelanggan("Empal");
        
        Pelanggan nama3 = new Pelanggan("Ira Yuti");
        Pelanggan alamat3 = new Pelanggan("Cimahi");
        Pelanggan orderan3 = new Pelanggan("Rendang");
        
        System.out.println("Berikut Daftar Pelanggan yang berkunjung tanggal 10 Agustus 2020");
        System.out.println("Nama Pelanggan: "+nama.getPelanggan());
        System.out.println("Alamat Pelanggan: "+alamat.getPelanggan());
        System.out.println("Orderan: "+orderan.getPelanggan());
        System.out.println();
        
        System.out.println("Nama Pelanggan: "+nama2.getPelanggan());
        System.out.println("Alamat Pelanggan: "+alamat2.getPelanggan());
        System.out.println("Orderan: "+orderan2.getPelanggan());
        System.out.println();
        
        System.out.println("Nama Pelanggan: "+nama3.getPelanggan());
        System.out.println("Alamat Pelanggan: "+alamat3.getPelanggan());
        System.out.println("Orderan: "+orderan3.getPelanggan());
        System.out.println();
        
        System.out.println("Pelanggan yang berkunjung kembali:");
        Pelanggan nama4 = nama.clone();
        System.out.println("Nama Pelanggan : "+nama.getPelanggan());
        Pelanggan alamat4 = alamat.clone();
        System.out.println("Alamat Pelanggan : "+alamat.getPelanggan());
        Pelanggan orderan4 = orderan.clone();
        System.out.print("Orderan Pelanggan : "+orderan.getPelanggan());
        System.out.print(", "+orderan2.getPelanggan());
        System.out.print(", "+orderan3.getPelanggan());
    }
}
