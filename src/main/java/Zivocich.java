import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public abstract class Zivocich {
    int pocet_noh = 5;
    public abstract void zvuk();


    public static void main (String [] args){
        var psik = new Pes("Stela");
        var clovek = new Clovek("Fero Hora");

        //psik.zvuk();
        //clovek.zvuk();

        var list = new ArrayList<>();
        list.add("desačik pišačik");
        list.add(10);
        list.add(new Pes("Ajax"));
        list.add(new Clovek("Jozko"));
        System.out.println(list.size());

        for(int j = 0; j < list.size();j++){
            System.out.println(list.get(j));
        }

        ArrayList<Clovek> listludi = new ArrayList<>();
        listludi.add(new Clovek("JankoPanko"));
        listludi.add(new Clovek("Adamko"));
        System.out.println(listludi.size());
        for(int j = 0; j < listludi.size();j++){
            System.out.println(listludi.get(j));
        }




    }
}
