import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public abstract class Zivocich {
    int pocet_noh = 5;
    public abstract void zvuk();


    public static void main (String [] args){
        /*
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







        var listZklavesnice = new ArrayList<>();
        int i = ZKlavesnice.readInt("Zadaj pocet prvkov pola");
        int j = ZKlavesnice.readInt("Zadaj cislo ktore sa vymazat");
        for (int pocitadlo = 0; pocitadlo < i; pocitadlo++){
            listZklavesnice.add(pocitadlo);
            //listZklavesnice.remove(3);
            //System.out.println(listZklavesnice.get(pocitadlo));//listZklavesnice.get(pocitadlo);
        }
        for (int delete = 0; delete < i; delete = delete + j )
            listZklavesnice.remove(delete);

        for (int m = 0; m < listZklavesnice.size();m++){
            System.out.println(listZklavesnice.get(m));
        }

         */

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("1"); list1.add("2"); list1.add("3");
        //System.out.println(list1.size());

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("ja"); list2.add("my"); list2.add("oni");

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("trojuholnik"); list3.add("kruh"); list3.add("kocka");

        ArrayList<ArrayList<String>> list2D = new ArrayList<>();
        list2D.add(list1); list2D.add(list2); list2D.add(list3);
        System.out.println(list2D.get(0));
        System.out.println(list2D.get(1));
        System.out.println(list2D.get(2));













    }
}
