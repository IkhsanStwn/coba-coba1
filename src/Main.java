public class Main {
    public Main(){
        Labalaba labalaba = new Labalaba("Merah");

        labalaba.menempel();
        labalaba.menyerang();

        SpiderMan spiderMan = new SpiderMan("Hitam");

        spiderMan.lari();
        spiderMan.lompat();
        spiderMan.memanjat();
        spiderMan.menempel();

    }

    public static void main (String[] args){
        new Main();
    }
}
