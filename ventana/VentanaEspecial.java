package ventana;
public class VentanaEspecial extends Ventana{
    public void copiar(char c, int veces, int x, int y){
        System.out.println("Estoy en el metodo de la clase derivada copiar con 4 argumentos: char, int,int,int");


    }
    @Override
    public void copiar(Ventana w){
        System.out.println("Estoy en el metodo copiar de la clase derivada: 1 argumento de tipo Ventana");

    }

    public void copiar(char c, int veces, int x, double y){
        System.out.println("Estoy en el metodo de la clase derivada copiar con 4 argumentos: char, int,int,double");

    }


}