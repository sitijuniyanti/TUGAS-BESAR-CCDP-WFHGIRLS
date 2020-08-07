public class BridgePatternDemo {
    public static void main(String[] args) {
        System.out.println("Restoran New Normal");
        System.out.println("-------------------------");
        Pesanan makanan = new Packing("M001","Rendang", "20000", new Makanan());
        Pesanan minuman = new Packing("D001","Teh Manis", "5000", new Minuman());

        makanan.setItem();
        minuman.setItem();
    }
}
