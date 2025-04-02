package figuras;
public class Circulo extends ObjGeometrico{
    //atributos
    private double radio;
    private final double PI=3.1416;

    //constructor
    public Circulo(double x, double y,double r){
        super(x,y); //llama a constructor de la clase base
        radio = r;
    }
    //metodo personalizado
    public double area(){
        return PI * radio * radio;
    }



}