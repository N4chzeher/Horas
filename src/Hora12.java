/**
 * Created by NACHZEHER on 23/05/2017.
 */
public class Hora12 extends Hora{

    protected enum Meridiano {AM,PM};
    protected Meridiano mer;

    public Hora12 (int hora, int minutos, Meridiano mer){

        super(hora, minutos);
        this.mer=mer;
        setHora(hora);
    }

    public void setMer(Meridiano mer) {
        this.mer = mer;
    }

    @Override
    public void inc() {
        super.inc();
        if(hora > 12){
            hora=1;
        }
    }

    @Override
    public void setHora(int hora) {
        if(1 <= hora && hora <=12){
        this.hora=hora;
        }
        else{
            throw new IllegalArgumentException("La hora debe estar entre 1 y 12");
        }
    }

    @Override
    public String toString() {
        return "Hora12{" +
                "mer=" + mer +
                "} " + super.toString();
    }
}
