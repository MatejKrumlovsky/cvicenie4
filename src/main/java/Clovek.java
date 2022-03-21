public class Clovek extends Zivocich{

    private final String meno;

    @Override
    public String toString() {
        return meno;
    }

    public Clovek(String meno) {
        this.meno = meno;
    }

    @Override
    public void zvuk() {
        System.out.println(meno+ " aaaaaaa");
        this.pocet_noh = 2;
    }
}
