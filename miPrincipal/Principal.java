package miPrincipal;
import java.util.Date;

public class Principal {
    

    public static void main(String[] args) {
        //crear objetos Publicacion
        Publicacion publicacion = new Publicacion();
        Date fecha = new Date("01/01/1989");

        Publicacion publicacion2 = new Publicacion("McGrawnHill",fecha);

        publicacion.setEditorial("Cielo");
        Date fecha2 = new Date("12/10/2000");
        publicacion.setFecha(fecha2);

        //crear objetos Revista

       


        
    }
}