import java.util.ArrayList;
import java.util.List;

public class Pesanan {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public int getCost(){
        int bayar = 0;

        for (Item item : items) {
            bayar += item.harga();
        }
        return bayar;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Id : " + item.id());
            System.out.print(", Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Harga : " + item.harga());
        }
    }
}
