public class Minuman implements Item {
    @Override
    public void ambilItem(String id, String nama, String harga) {
        System.out.println("Pemesanan Minuman : ID Minuman : " + id + ", Nama : " + nama + ", Harga  : Rp. " + harga );
    }
}
