public class PesananBuilder {
    public Pesanan prepareAyam (){
        Pesanan pesanan = new Pesanan();
        pesanan.addItem(new Ayam());
        pesanan.addItem(new TehManis());
        return pesanan;
    }

    public Pesanan prepareRendang (){
        Pesanan pesanan = new Pesanan();
        pesanan.addItem(new Rendang());
        pesanan.addItem(new Juice());
        return pesanan;
    }

    public Pesanan prepareEmpal (){
        Pesanan pesanan = new Pesanan();
        pesanan.addItem(new Empal());
        pesanan.addItem(new Juice());
        return pesanan;
    }

}
