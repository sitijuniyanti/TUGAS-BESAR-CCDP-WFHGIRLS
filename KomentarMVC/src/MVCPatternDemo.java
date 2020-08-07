public class MVCPatternDemo {
    public static void main(String[] args) {

        // Fetch student record based on his roll number from the database
        Komentar model = retrieveKomentarFromDatabase();

        KomentarView view = new KomentarView();

        KomentarController controller = new KomentarController(model, view);

        controller.updateView();

        controller.setKomentarNama("Vanadia Aviandi");
        controller.updateView();
    }

    private static Komentar retrieveKomentarFromDatabase(){
        return new Komentar("Saya","Ini restoran bintang 5", "5");
    }
}
