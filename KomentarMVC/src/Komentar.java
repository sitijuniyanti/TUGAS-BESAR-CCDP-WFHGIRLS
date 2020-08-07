public class Komentar {
    private String nama_pelanggan;
    private String isi_komentar;
    private String rating;

    public Komentar(String nama_pelanggan, String isi_komentar, String rating) {
        this.nama_pelanggan = nama_pelanggan;
        this.isi_komentar = isi_komentar;
        this.rating = rating;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getIsi_komentar() {
        return isi_komentar;
    }

    public void setIsi_komentar(String isi_komentar) {
        this.isi_komentar = isi_komentar;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
