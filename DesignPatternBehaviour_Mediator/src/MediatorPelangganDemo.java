/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanadia
 */
public class MediatorPelangganDemo {
    public static void main(String[] args){
        Pelanggan pelanggan1 = new Pelanggan("Vanadia Aviandi");
        Pelanggan pelanggan2 = new Pelanggan("Siti Juniyanti");
        Pelanggan pelanggan3 = new Pelanggan("Ira Yuti");
        
        pelanggan1.sendNotif("Memesan Ayam");
        pelanggan2.sendNotif("Memesan Empal");
        pelanggan3.sendNotif("Memesan Rendang");
    }
}
