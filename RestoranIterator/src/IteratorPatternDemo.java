public class IteratorPatternDemo {
    public static void main(String[] args) {
        Menu menu = new Menu();
        System.out.println("Daftar Menu Restoran New Normal");

        for(Iterator iter = menu.getIterator(); iter.hasNext();){
            String makanan = (String)iter.next();
            System.out.println( makanan);
        }
    }
}
