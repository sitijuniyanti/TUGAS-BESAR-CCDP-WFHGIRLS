public class Ayam implements ReviewPelanggan {

    @Override
    public void nama_pelanggan() {
        System.out.println("Vanadia Aviandi");
    }

    @Override
    public void isi_komentar() {
        System.out.println("Ayamnya enak banget, bumbunya meresap sampai ke tulang-tulang");
    }

    @Override
    public void rating() {
        System.out.println("5");
    }

}
