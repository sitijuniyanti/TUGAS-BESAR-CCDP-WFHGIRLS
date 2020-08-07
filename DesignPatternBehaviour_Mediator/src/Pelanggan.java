/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanadia
 */
public class Pelanggan {
    private String nama;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public Pelanggan(String nama){
        this.nama = nama;
    }
    
    public void sendNotif(String notif){
        Kunjungan.showNotif(this, notif);
    }
}
