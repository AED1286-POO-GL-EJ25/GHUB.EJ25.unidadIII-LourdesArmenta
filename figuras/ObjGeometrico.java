package figuras;
/*
 * Herencia publica
 * Tipo de elemento ¿Accesible a la clase de    ¿Accesible a la clase   ¿Accesible a clase
 *                   paquete?                    derivada?              derivada de otro paquete?
 *  public              si                          si                      si
 *  protected           si                          si                      si
 *  private             no                          no                      no
 *  omision(amigas)     si                          si                      no
 */
public class ObjGeometrico {
    //atributos
     protected double px; //ambito protegido
     double py; //ambito por omision
    //constructos
    public ObjGeometrico(){
        px=0;
        py=0;


    }
    public ObjGeometrico(double x, double y){
        this.px = x;
        this.py = y;
    }
    public void imprimirCentro(){
        System.out.println("("+px+","+py+")");
        
    }

}
