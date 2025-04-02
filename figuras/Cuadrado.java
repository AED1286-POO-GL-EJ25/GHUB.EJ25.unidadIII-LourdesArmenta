package figuras;
public class Cuadrado extends ObjGeometrico{
    //atributos
    private double x1,y1;
    //constructores
    public Cuadrado(double xc, double yc, double t1, double t2){
        super(xc,yc);
        this.x1 = t1;
        this.y1 = t2;
    }
    public double area(){
        double a,b;
        a = px-x1;
        b = py-y1;
        return 2*(a*a+b*b);
    }


}