package miPrincipal;
import java.util.Date;
import ventana.*;


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
        Libro libro2 = new Libro("1245455","Benito Perez Galdor"); //invoco al constructor con 2 argumentos
        Libro libro3 = new Libro("AlgaOmega",new Date("15/08/1990"),"111111","Gabriel Garcia Marquea");

        //imprimir los objetos
        System.out.println(publicacion);
        System.out.println(publicacion2.toString());
        System.out.println();

        System.out.println(revista1);
        System.out.println(revista2);
        System.out.println(revista3.toString());
        System.out.println();

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        //crear objetos Ventana
        Ventana ventana1 = new Ventana();
        VentanaEspecial ve1 = new VentanaEspecial();

        ventana1.copiar(ventana1);
        ventana1.copiar("*******",5,10);

        ve1.copiar(ve1);
        ve1.copiar("!!!!!!!!!!!!!!",10,20);
        ve1.copiar('*',100,8,13);

        ve1.copiar('X',5,9,7.1259F);





        



       


        
    }
}