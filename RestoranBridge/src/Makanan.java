public class Makanan implements Item {
    @Override
    public void ambilItem(String id, String nama, String harga) {
        System.out.println("Pemesanan Makanan : ID Makanan : " + id + ", Nama : " + nama + ", Harga  : Rp. " + harga );
    }
}
