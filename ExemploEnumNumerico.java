import java.util.Scanner;

// Definição do enum que representa os níveis de acesso
enum NivelAcesso {
    ADMIN,
    USUARIO,
    CONVIDADO,
    DARTH_VADER
}

public class ExemploEnumNumerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções para o usuário
        System.out.println("Escolha o nível de acesso:");
        System.out.println("1 - ADMIN");
        System.out.println("2 - USUARIO");
        System.out.println("3 - CONVIDADO");
        System.out.println("4 - DARTH VADER");
        System.out.print("Digite o número correspondente: ");

        int opcao = scanner.nextInt(); // Lê o número digitado pelo usuário

        try {
            // Variável para armazenar o nível escolhido
            NivelAcesso nivel;

            // Converte a escolha numérica para o enum correspondente
            switch (opcao) {
                case 1:
                    nivel = NivelAcesso.ADMIN;
                    break;
                case 2:
                    nivel = NivelAcesso.USUARIO;
                    break;
                case 3:
                    nivel = NivelAcesso.CONVIDADO;
                    break;
                case 4:
                    nivel = NivelAcesso.DARTH_VADER;
                    break;    
                default:
                    // Se o número não for 1, 2, 3 ou 4 lança exceção
                    throw new IllegalArgumentException();
            }

            // Mostra o nível escolhido
            System.out.println("Nível de acesso escolhido: " + nivel);

            // Usa switch novamente para exibir mensagens específicas
            switch (nivel) {
                case ADMIN:
                    System.out.println("Acesso total ao sistema.");
                    break;
                case USUARIO:
                    System.out.println("Acesso limitado: pode usar funções básicas.");
                    break;
                case CONVIDADO:
                    System.out.println("Apenas visualização.");
                    break;
                case DARTH_VADER:
                    System.out.println("Sua falta de fé é perturbadora.");
                    break;    
            }
        } catch (IllegalArgumentException e) {
            // Caso o usuário digite um número inválido
            System.out.println("Opção inválida! Digite 1, 2, 3 ou 4.");
        }

        // Fecha o Scanner
        scanner.close();
    }
}