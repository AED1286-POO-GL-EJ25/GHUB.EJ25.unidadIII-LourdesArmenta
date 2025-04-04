package fecha;
import java.util.Scanner;

public class TestFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Fecha1 (dia,mes,anio):");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();

        //creamos el objeto de la clase Fecha
        Fecha f1 = new Fecha(dia,mes,anio);

        System.out.println("Fecha1 capturada: "+f1.getDia()+" "+f1.getMes()+" "+f1.getAnio());
        System.out.println(f1);

        System.out.println("Ingrese Fecha2 (dia,mes,anio):");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        anio = scanner.nextInt();
        Fecha f2 = new Fecha(dia,mes,anio);

        System.out.println("Fecha2 capturada: "+f2.getDia()+" "+f2.getMes()+" "+f2.getAnio());
        System.out.println(f2);

        /*
        if(f1.getDia() == f2.getDia() && f1.getMes()==f2.getMes() && f1.getAnio()==f2.getAnio() )
            System.out.println("Las fechas son iguales");
        else    
            System.out.println("Las fechas son diferentes");
        */
        if (f1.equals(f2))
            System.out.println("Las fechas son iguales");
        else    
            System.out.println("Las fechas son diferentes");




        
    }
    
}
