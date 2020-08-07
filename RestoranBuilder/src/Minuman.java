public abstract class Minuman implements Item {
    @Override
    public Packing packing() {
        return new BungkusCup();
    }

    @Override
    public abstract int harga();
}
