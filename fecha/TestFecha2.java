package fecha;

import java.util.Scanner;

public class TestFecha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Fecha1 (dd/mm/aaaa):");
        String sFecha = scanner.nextLine();
        Fecha f1 = new Fecha(sFecha);
        System.out.println(f1);

        System.out.println("Ingrese Fecha2 (dd/mm/aaaa):");
        sFecha = scanner.nextLine();
        Fecha f2 = new Fecha(sFecha);
        System.out.println(f2);

        if (f1.equals(f2))
          System.out.println("Las fechas son iguales");
        else    
          System.out.println("Las fechas son diferentes");


        
    }
    
}
