public class Pes extends Zivocich{


    private final String meno;

    public Pes(String meno) {
        this.meno = meno;
    }

    @Override
    public void zvuk() {
        System.out.println(meno + " hau hau");
        this.pocet_noh = 4;

    }
}
