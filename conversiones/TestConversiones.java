package conversiones;

public class TestConversiones {
    public static void main(String[] args) {
        int k = (int)5.8; //convierte un double a un int
        System.out.println(k);

        Integer g = new Integer(66);
        System.out.println(g);

        double x = (double)g;
        System.out.println(x);

        //Revista pb = (Revista)g; //no todas las conversiones son posibles

        int var1 = 5;
        double var2 = var1; //conversion automativa implcita

        System.out.println("Valor de var1: "+var1);
        System.out.println("Valor de var2: "+var2);

        double var3 = 3.1416;
        int var4 = (int) var3; //conversion explicita

        System.out.println("Valor de var3: "+var3);
        System.out.println("Valor de var4: "+var4);

        Barco barco;
        Velero velero = new Velero();
        DeVapor deVapor = new DeVapor();
        barco = velero; //conversion automatica
        barco = deVapor; //conversion automatica

        Barco barco2;
        DeVapor deVapor2 = new DeVapor();
        Carguero carguero = new Carguero();
        barco = carguero; //conversion automatica
        deVapor2 = carguero; //converion automatica

  

        
    }
    
}
