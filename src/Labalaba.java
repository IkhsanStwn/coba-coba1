public class Labalaba extends Hewan{

    String warna;

    public Labalaba(String warna){
        this.warna = warna;
    }

    public void menempel(){
        System.out.println("laba-laba menempel dibaju");
    }

    @Override
    public void menyerang() {
        System.out.println("Laba-laba " + warna + " menyerang ucup dengan menggigit");
    }
}
