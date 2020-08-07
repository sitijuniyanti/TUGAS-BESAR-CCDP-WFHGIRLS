public class Rendang implements ReviewPelanggan {
    @Override
    public void nama_pelanggan() {
        System.out.println("Ira Yuti");
    }

    @Override
    public void isi_komentar() {
        System.out.println("Rendangnya enak banget");
    }

    @Override
    public void rating() {
        System.out.println("5");
    }
}
