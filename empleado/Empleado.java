package empleado;
public class Empleado{
    //atributos
    private String nombre;
    private int edad;
    private String tipoRelacionLaboral;
    //constructores
    public Empleado(){

    }
    public Empleado(String nombre, int edad, String tipoRelacionLaboral){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoRelacionLaboral = tipoRelacionLaboral;
    }
    //metodos personalizados
    //getter y setter
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //toString

}