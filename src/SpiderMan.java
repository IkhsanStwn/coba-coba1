public class SpiderMan extends Labalaba implements Parkour{

    public SpiderMan(String warna) {
        super(warna);
    }

    @Override
    public void lompat() {
        System.out.println("Spiderman " + warna + " lompat");
    }

    @Override
    public void lari() {
        System.out.println("Spiderman " + warna + " berlari");
    }

    @Override
    public void memanjat() {
        System.out.println("Spiderman " + warna + " memanjat gedung di kota " + lokasi);
    }

    @Override
    public void menempel(){
        System.out.println("Spiderman " + warna + " menempel pada kaca gedung di kota " + lokasi);
    }
}
