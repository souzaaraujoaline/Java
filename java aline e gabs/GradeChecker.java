public class GradeChecker {
    public static void main(String[] args) {
        int grade = 85; //definindo o valor da variável

        if (grade >= 90) { //caso numero for maior ou igual a 90 print esse resultado
            System.out.println("Excelente!");
        } else if (grade >= 80) { //segue a mesma lógica para todos!
            System.out.println("Muito bom!");
        } else if (grade >= 70) {
            System.out.println("Bom! ");
        } else if (grade >= 60) {
            System.out.println("Sastifatorio!");
        } else{
            System.out.println("Precisa melhorar!");
        }
    }
}

