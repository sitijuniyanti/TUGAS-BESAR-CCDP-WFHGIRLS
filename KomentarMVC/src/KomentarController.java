public class KomentarController {
    private Komentar model;
    private KomentarView view;

    public KomentarController(Komentar model, KomentarView view) {
        this.model = model;
        this.view = view;
    }
    public void setKomentarNama(String nama_pelanggan){
        model.setNama_pelanggan(nama_pelanggan);
    }

    public void setIsiKomentar(String isi_komentar){
        model.setIsi_komentar(isi_komentar);
    }

    public void setRating(String rating){
        model.setRating(rating);
    }

    public String getKomentarNama(){
        return model.getNama_pelanggan();
    }

    public String getIsiKomentar(){
        return model.getIsi_komentar();
    }

    public String getRating(){
        return model.getRating();
    }

    public void updateView(){
        view.printKomentarDetails(model.getNama_pelanggan(), model.getIsi_komentar(), model.getRating());
    }
}
