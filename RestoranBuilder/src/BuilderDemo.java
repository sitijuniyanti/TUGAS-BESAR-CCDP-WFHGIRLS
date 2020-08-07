public class BuilderDemo {
    public static void main(String[] args) {
        System.out.println("Restoran New Normal");


        PesananBuilder pesananBuilder = new PesananBuilder();
        Pesanan pesananAyam = pesananBuilder.prepareAyam();
        System.out.println("Pesanan Ayam");
        pesananAyam.showItems();
        System.out.println("Total Harga: " +pesananAyam.getCost());

        PesananBuilder pesananBuilder1 = new PesananBuilder();
        Pesanan pesananRendang = pesananBuilder1.prepareRendang();
        System.out.println("Pesanan Rendang");
        pesananRendang.showItems();
        System.out.println("Total Harga: " +pesananRendang.getCost());

        PesananBuilder pesananBuilder2 = new PesananBuilder();
        Pesanan pesananEmpal = pesananBuilder2.prepareEmpal();
        System.out.println("Pesanan Empal");
        pesananEmpal.showItems();
        System.out.println("Total Harga: " +pesananEmpal.getCost());
    }
}
