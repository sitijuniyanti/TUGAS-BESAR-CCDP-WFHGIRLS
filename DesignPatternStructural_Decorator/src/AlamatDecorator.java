/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanadia
 */
public abstract class AlamatDecorator implements Pelanggan{
    protected Pelanggan decoratedPelanggan;
    
    public AlamatDecorator(Pelanggan decoratorPelanggan){
        this.decoratedPelanggan = decoratorPelanggan;
    }

    @Override
    public void pesan() {
        decoratedPelanggan.pesan();
    }
}
