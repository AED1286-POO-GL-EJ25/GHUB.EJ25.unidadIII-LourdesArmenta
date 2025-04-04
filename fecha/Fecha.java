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
    public Fecha(String s){
         //buscamos la primera coincidencia de /
         int pos1 = s.indexOf('/');

         //buscamos la ultima posicion del /
         int pos2 = s.lastIndexOf('/');
 
         //procesar el dia
         String sDia = s.substring(0, pos1);
         this.dia = Integer.parseInt(sDia);
 
         //procesamos el mes
         String sMes = s.substring(pos1+1,pos2);
         this.mes = Integer.parseInt(sMes);
 
         //procesamos el anio
         String sAnio = s.substring(pos2+1);
         this.anio = Integer.parseInt(sAnio);

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

    @Override
    public String toString(){
        return this.dia+"/"+this.mes+"/"+this.anio;
    }

    @Override
    public boolean equals(Object o){
        Fecha otra = (Fecha)o; //convierte el Objeto o en una variable tipo Fecha y la almacena en otra
        return (this.dia == otra.dia && this.mes == otra.mes && this.anio == otra.anio);



    }
    
    
}
