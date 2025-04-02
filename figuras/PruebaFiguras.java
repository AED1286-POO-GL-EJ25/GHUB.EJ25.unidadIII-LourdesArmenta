package figuras;
public class PruebaFiguras{
    public static void main(String[] args) {
        Circulo cr = new Circulo(2.0,2.5,2.0);
        Cuadrado cd = new Cuadrado(3.0,3.5,26.37,3.85);
        System.out.print("Centro del circulo:");
        cr.imprimirCentro(); // esta es un metodo heredado de ObjGeometrico
        System.out.print("Centro del cuadrado:");
        cd.imprimirCentro(); //este es un metodo heredadeo de ObjGeometrico
        System.out.println("Area del circulo: "+cr.area());
        System.out.println("Area del cuadrado: "+cd.area());


        
        
    }
}