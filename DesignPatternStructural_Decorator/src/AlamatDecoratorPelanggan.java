/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanadia
 */
public class AlamatDecoratorPelanggan extends AlamatDecorator{
    public AlamatDecoratorPelanggan(Pelanggan decoratorPelanggan) {
        super(decoratorPelanggan);
    }
    
    @Override
    public void pesan(){
        decoratedPelanggan.pesan();
        setAlamatPelanggan(decoratedPelanggan);
    }
    
    private void setAlamatPelanggan(Pelanggan decoratedPelanggan){
        System.out.println("Alamat Pelanggan : Ciroyom");
    }
}
