public abstract class Pesanan {
    protected Item item;

    protected Pesanan(Item item){
        this.item = item;
    }
    public abstract void setItem();
}
