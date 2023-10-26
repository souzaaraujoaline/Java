//Aline e Gabs
import java.util.Scanner;

public class Trabalho {
    public static void main (String [] args) {

        String [] times = {
            "Uberaba", "Ipiranga", "Nacional", "Pinheiros", "Leblon", "Vila Nova",
            "Mangueiras", "Flamengo", "Grêmio", "Corinthians", "Fluminense", "Independente",
            "Atlético Mineiro", "Cruzeiro", "Bragantino", "Vasco", "Mirassol", "Goiás", "Santos", "Coritiba"
        };
        int [] pontuacoes = new int[times.length];

        int [] cartoesAmarelos = new int[times.length];

        int [] vitorias = new int[times.length];

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Visualizar Tabela");
            System.out.println("2 - Editar Pontuação");
            System.out.println("3 - Editar Vitorias");
            System.out.println("4 - Adicionar Cartões Amarelos");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    scanner.close();
                    return;
                case 1:
                    exibirTabela(times, pontuacoes, vitorias, cartoesAmarelos);
                    break;
                case 2:
                    editarPontuacao(times, pontuacoes, vitorias, cartoesAmarelos, scanner);

                    break;
                

                case 3:
                    editarVitorias(times, pontuacoes, vitorias, cartoesAmarelos, scanner);

                    break;
                    
                case 4:
                    editarcartoesAmarelos(times, pontuacoes, vitorias, cartoesAmarelos, scanner);

                    break;
                default:

                    System.out.println("Opção inválida. Tente novamente. ");
                    break;
            }   
        }
    }

    public static void exibirTabela(String[] times, int[] pontuacoes, int[] vitorias, int []cartoesAmarelos) {
        System.out.println("\nPosição | Time | Pontuação | Vitorias | Cartões Amarelos");
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + "       | " + times[i] + "   |   " + pontuacoes[i] + "|" + vitorias[i] + "|" + cartoesAmarelos[i]);
        }
    }
    public static void exibirTimes(String[] times, int[] pontuacoes, int[] vitorias, int[] cartoesAmarelos) {
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + " - " + times[i] + " | Pontuação: " + pontuacoes[i] + "| Vitorias:" + vitorias[i] + "| Cartões Amarelos:" + cartoesAmarelos[i]);
        }
    }

    public static void editarPontuacao(String[] times, int[] pontuacoes, int[] vitorias, int[] cartoesAmarelos, Scanner scanner) {

        while (true) {
            System.out.println("\nTimes disponíveis para edição:");
            exibirTimes(times, pontuacoes, vitorias, cartoesAmarelos);

            System.out.println("Escolha o número do time para editar a pontuação (ou 0 para voltar):");

            int posicao = scanner.nextInt();

            if (posicao == 0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite a nova pontuação para " + times[posicao - 1] + ":");
                int novaPontuacao = scanner.nextInt();

                if (novaPontuacao >= 0) {
                    pontuacoes[posicao - 1] = novaPontuacao;
                } else {
                    System.out.println("A pontuação não pode ser negativa.");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }

            scanner.nextLine();
        }
        ordenarPorPontuacaoEVitoriasECartoes(times, pontuacoes, vitorias, cartoesAmarelos);
    }

    public static void editarVitorias(String[] times, int [] pontuacoes, int []vitorias, int[]cartoesAmarelos, Scanner scanner) {
        while(true){
            System.out.println("\nTimes disponíveis para edição:");
            exibirTimes(times, pontuacoes, vitorias, cartoesAmarelos);
            System.out.println("\nEscolha o número do time para editar as vitorias (ou 0 para voltar):");
            int posicao = scanner.nextInt();
            if(posicao==0){
                break;
            }
            if (posicao>=1 && posicao <=times.length){
                System.out.println("Digite o novo número de vitorias do " + times[posicao-1] + ":");
                int novasVitorias = scanner.nextInt();
                if (novasVitorias>=0) {
                    vitorias[posicao-1] = novasVitorias;
                } else {
                    System.out.println("O número de vitorias não pode ser negativo.");
                }
            } else {
                System.out.println("Posição inválida, tente novamente.");
            }
            scanner.nextLine();
        } 
    }

    private static void editarcartoesAmarelos(String[] times, int [] pontuacoes, int [] vitorias, int []cartoesAmarelos, Scanner scanner) {
        while(true){
            System.out.println("\nTimes disponíveis para edição:");
            exibirTimes(times, pontuacoes, vitorias, cartoesAmarelos);
            System.out.println("\nEscolha o número do time para editar os cartões amarelos (ou 0 para voltar):");
            int posicao = scanner.nextInt();
            if(posicao==0){
                break;
            }
            if (posicao>=1 && posicao <=times.length){
                System.out.println("Digite o novo número de cartões amarelos do " + times[posicao-1] + ":");
                int novosCartoes = scanner.nextInt();
                if (novosCartoes>=0) {
                    cartoesAmarelos[posicao-1] = novosCartoes;
                } else {
                    System.out.println("O número de cartões amarelos não pode ser negativo.");
                }
            } else {
                System.out.println("Posição inválida, tente novamente.");
            }
            scanner.nextLine();
        } 
    }

    public static void ordenarPorPontuacaoEVitoriasECartoes(String[] times, int[] pontuacoes, int[] vitorias, int[]cartoesAmarelos) {
        for (int i = 0; i < pontuacoes.length - 1; i++) {
            for (int j = i + 1; j < pontuacoes.length; j++) {

                if (pontuacoes[i] < pontuacoes[j] || (pontuacoes[i] == pontuacoes[j]&& vitorias[i]>vitorias[j] || (pontuacoes[i] == pontuacoes[j]&& cartoesAmarelos[i]>cartoesAmarelos[j]))) {

                    int tempPontuacao = pontuacoes[i];
                    pontuacoes[i] = pontuacoes[j];
                    pontuacoes[j] = tempPontuacao;

                    int tempCartoes = cartoesAmarelos[i];
                    cartoesAmarelos[i] = cartoesAmarelos[j];
                    cartoesAmarelos[j] = tempCartoes;


                    String tempTime = times[i];
                    times[i] = times[j];
                    times[j] = tempTime;
                }
            } 
        }
    }
}
