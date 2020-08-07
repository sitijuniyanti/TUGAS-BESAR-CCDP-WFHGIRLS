public class AdminRestoran {
    private ReviewPelanggan ayam;
    private ReviewPelanggan empal;
    private ReviewPelanggan rendang;

    public AdminRestoran() {
        ayam = new Ayam();
        empal = new Empal();
        rendang = new Rendang();
    }

    public void komentarAyam(){
        ayam.nama_pelanggan();
        ayam.isi_komentar();
        ayam.rating();
    }

    public void komentarEmpal(){
        empal.nama_pelanggan();
        empal.isi_komentar();
        empal.rating();
    }

    public void komentarRendang(){
        rendang.nama_pelanggan();
        rendang.isi_komentar();
        rendang.rating();
    }

}
