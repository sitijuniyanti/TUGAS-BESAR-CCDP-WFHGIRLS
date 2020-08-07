public class Menu implements Container {
    public String makanan[] = {"Rendang Rp. 20.000" , "Ayam Rp. 15.000" ,"Empal Rp. 25.000"};
    @Override
    public Iterator getIterator() {
        return new MakananIterator();
    }

    private class MakananIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < makanan.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return makanan[index++];
            }
            return null;
        }

    }
}
