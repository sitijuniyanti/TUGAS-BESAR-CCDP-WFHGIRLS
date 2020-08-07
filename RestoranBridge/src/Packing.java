public class Packing extends Pesanan {
    private String id, nama, harga;

    public Packing(String id, String nama, String harga, Item item) {
        super(item);
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public void setItem() {
        item.ambilItem(id,nama,harga);
    }
}
