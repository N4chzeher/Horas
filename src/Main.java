/**
 * Created by NACHZEHER on 23/05/2017.
 */
public class Main {

    public static void main(String[] args) {

/*
        Hora r = new Hora(11,30);
        System.out.println(r);
        for (int i=1 ; i <=61 ; i++){
            r.inc();
        }
        System.out.println(r);
        r.setHora(20);
        System.out.println(r);


        Hora12 h12 =new Hora12(2,30, Hora12.Meridiano.AM);
        System.out.println(h12);
        for (int i=1 ; i <=61 ; i++){
            h12.inc();}
        System.out.println(h12);
        h12.setHora(8);
        System.out.println(h12);
        h12.setMer(Hora12.Meridiano.PM);
        System.out.println(h12);

        */

        HoraExacta he =new HoraExacta(10,15,30);
        System.out.println(he);
        for (int i = 1; i < 61; i++) {
            he.inc();
        }
        System.out.println(he);
        he.setSegundos(2);
        System.out.println(he);

    }
}
