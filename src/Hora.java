/**
 * Created by NACHZEHER on 23/05/2017.
 */
public class Hora {

    protected int hora,minutos;

    public Hora(int hora, int minutos){

        this.hora=0;
        this.minutos=0;
        setHora(hora);
        setMinutos(minutos);


    }

    public void inc(){
        minutos++;
        if (minutos >59){
            minutos=0;
            hora++;
            if (hora > 23){
                hora = 0;
            }
        }
    }



    public void setHora(int hora) {
        if(0 <= hora && hora <=24){
        this.hora = hora;}
    }

    public void setMinutos(int minutos) {
        if(0 <= minutos && minutos <=60){
        this.minutos = minutos;}
    }

    @Override
    public String toString() {
        return "Hora " +
                "hora=" + hora +
                ", minutos=" + minutos +
                '}';
    }

}
