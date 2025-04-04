package fecha;

public class Fecha {
    //atributos
    private int dia;
    private int mes;
    private int anio;
    //constructores
    public Fecha(){
        this.dia=1;
        this.mes =1;
        this.anio = 1900;
    }
    public Fecha(int dia, int mes,int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    //getter y setter
    public int getDia(){
        return this.dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getMes(){
        return this.mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getAnio(){
        return this.anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    
}
