public class FacadePatternClient {
    public static void main(String[] args) {
        AdminRestoran adminRestoran = new AdminRestoran();

        adminRestoran.komentarAyam();
        adminRestoran.komentarEmpal();
        adminRestoran.komentarRendang();

    }
}
