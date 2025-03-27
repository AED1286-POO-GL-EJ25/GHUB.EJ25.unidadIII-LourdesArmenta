package miPrincipal;
import java.util.Date;
public class Libro extends Publicacion{
    //atributos
    private String periodicidad;
    private int ejemplares;
    //constructores
    public Libro(){
        super();

    }
    public Libro(String periodicidad, int ejemplares){
        super("sin definir",null);
        this.periodicidad = periodicidad;
        this.ejemplares = ejemplares;

    }
    public Libro(String editorial, Date fecha,String periodicidad, int ejemplares ){
        super(editorial, fecha);
        this.periodicidad = periodicidad;
        this.ejemplares = ejemplares;

    }
    //metodos personalizado
    //getter y setter
    public String getPeriodicidad(){
        return this.periodicidad;
    }
    public void setPeriodicidad(String periodicidad){
        this.periodicidad = periodicidad;
    }

    public int getEjemplares(){
        return this.ejemplares;
    }
    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }
    //sobreescritos
    @Override
    public String toString(){
        return "Periodicidad: "+this.periodicidad+" Ejemplares: "+this.ejemplares;
    }



}