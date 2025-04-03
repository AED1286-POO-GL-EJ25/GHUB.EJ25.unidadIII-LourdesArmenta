package conversiones;
public class TestBarco{
    public static void main(String[] args) {
        Barco bs[] = new Barco[3]; //creo un arreglo de 3 barcos y lo nombro bs
        DeVapor deVapor = new DeVapor(); //creo un objeto tipo DeVapor
        System.out.println();
        Velero velero = new Velero(); //creo un objeto de tipo Velero
        Carguero carguero = new Carguero(); //creo un objeto de tipo Cargero
        System.out.println();
        bs[0]= deVapor;
        bs[1]= velero;
        bs[2]= carguero;
        //recorro el arreglo de barcos
        for (int i=0; i<3; i++){
            bs[i].alarma();
        }





        
    }
}