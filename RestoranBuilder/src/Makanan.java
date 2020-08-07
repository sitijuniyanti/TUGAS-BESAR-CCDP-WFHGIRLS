public abstract class Makanan implements Item{
    @Override
    public Packing packing() {
        return new BungkusStyrofoam();
    }

    @Override
    public abstract int harga();

}
