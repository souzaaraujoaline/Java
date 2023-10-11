package Ex4;

public class AreaCirculo {
        public static void main(String[] args) {

            double c = 20.0; 
            double l = 10.0; 
            double pi = 3.14;
    
            double perimetro = 2 * (c + l); 
    
            double raio = perimetro / (2 * pi); 
    
            double a = pi * Math.pow(raio, 2); 
    
            System.out.println("O raio do círculo é: " + raio + " cm"); 
            System.out.println("A área do círculo é: " + a + " cm²");
        }
    }
