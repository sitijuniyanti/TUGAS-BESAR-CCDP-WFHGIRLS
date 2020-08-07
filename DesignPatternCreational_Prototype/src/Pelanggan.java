/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Vanadia
 */
public class Pelanggan implements Cloning{
    private String nama;
    
    public Pelanggan(String nama){
        setPelanggan(nama);
    }
    
    @Override
    public Pelanggan clone(){
        Pelanggan b = null;
        try{
            b = (Pelanggan)super.clone();
        }catch(Exception e){
            
        }
        return b;
    }
    
    public String getPelanggan() {
        return nama;
    }
    
    public void setPelanggan(String nama){
        this.nama = nama;
    }
}
