import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
     
    public static void main(String[] args) throws InterruptedException, IOException {
        final int MAX_ELEMENTOS = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Piloto> pilotos = new ArrayList<>();
            Scanner in = new Scanner(System.in);
            int numCadastro = 0;
           
            int opcao;
            do {
                System.out.println("\n1 - Cadastrar Piloto");
                System.out.println("2 - Listar pilotos");
                System.out.println("3 - Consultar espaço!");
                System.out.println("4 - Aumente o seu espaço!");
                System.out.println("0 - Sair");
                System.out.print("\nDigite a opção desejada ? =>: ");
                opcao = in.nextInt();
                in.nextLine();
                
                switch (opcao) {
                    case 1: {
                        
                        if (numCadastro == MAX_ELEMENTOS) {
                        
                        System.out.println("\n ATENÇÃO !! Sem espaço para cadastrar novos pilotos. \n Vai para a opção 4 do Menu!");
                        System.out.println(" O seu espaco Atual é de: ( " + numCadastro + " )");
                        System.out.println(" O tamanho da lista e: ( " + pilotos.size() + " )");

                        voltarMenu(in);
                            continue;
                        } else {
                        System.out.println("Digite o nome do Piloto");
                        String nome = scanner.next();
                        System.out.println("Digite o cpf do Piloto");
                        String cpf = scanner.next();

                        Piloto Piloto = new Piloto(nome, cpf);
                        pilotos.add(Piloto);
                        numCadastro--;
                        System.out.println("Piloto adicionado com sucesso!");

                        voltarMenu(in);
                        break; 
                    
                    }}
                    case 2: 

                        if (numCadastro == 0) {

                            System.out.println("\nNão há motoristas cadastrados para exibir.\n");

                        } else {

                            System.out.println("\nListagem dos pilotos:\n"+pilotos+"\n");
                        
                        break;
                        }

                    case 3: {
                        System.out.println(" O seu espaco Atual é de: ( " + numCadastro + " )\n");
                        System.out.println(" O tamanho da lista e: ( " + pilotos.size() + " )");
                        System.out.println("Aumente na opçâo ( 4 ) do Menu..");

                        break;
                    }
                    
                    case 4: {
                            System.out.println("Digite a quantidade que vc precisa!");
                            numCadastro = scanner.nextInt();
                            
                            break;

                        }
                        default: {
                        System.out.println("Opção inválida!");
                        break;
                    
                        }
            }   

        } while (opcao != 0);
        
        System.out.println("Fim do programa!");}
                 
        }
                         
    private static void voltarMenu(Scanner in ) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu. \n Força Aérea Brasileira (FAB) ");
        in.nextLine();
        
        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
        System.out.print("\033[H\033[2J");

        System.out.flush();
        
        
    }   
}
    