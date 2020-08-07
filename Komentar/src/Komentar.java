public class Komentar {

    private static Komentar komentar;
    private String nama_pelanggan;
    private String isi_komentar;
    private String rating;

    private Komentar() {
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

    public static synchronized Komentar getKomentar(){
        if (komentar==null){
            komentar=new Komentar();
        }
        return komentar;
    }

    public void isiKomentar(){
        System.out.println("Empal di Rumah Makan Ini Terbaik");
    }
}
