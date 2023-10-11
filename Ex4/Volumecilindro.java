package Ex4;

public class Volumecilindro {
    
    public static void main (String[] args) {

    double v = 785;
    double h = 13;
    double pi = 3.14;
            

    double x = (4 * v) / (h * pi); 
    double diametro = Math.sqrt(x);

    double raio = diametro / 2;
    System.out.println("O raio da base é igual a: " + raio);
    
    }
}
