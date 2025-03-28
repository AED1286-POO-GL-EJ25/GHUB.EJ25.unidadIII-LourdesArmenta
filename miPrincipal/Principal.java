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
        Revista revista1 = new Revista(); //invoco al constructor vacio
        Revista revista2 = new Revista("semanal",500); //invoco al constructor con 2 argumentos
        Revista revista3 = new Revista("Televisa",new Date("01/06/2025"),"TV-notas",1000); 
                                //invoco al constructor con 4 argumentos

        //crear objetos Libro
        Libro libro1 = new Libro(); //invoco al constructor vacio
        Libro libro2 = new Libro()



       


        
    }
}