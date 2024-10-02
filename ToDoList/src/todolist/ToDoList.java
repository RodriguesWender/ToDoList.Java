
package todolist;

import java.util.Scanner;


public class ToDoList {

  
    public static void main(String[] args) {
        
 Scanner scanner = new Scanner(System.in);
        GerenciadorTarefa gerenciador = new GerenciadorTarefa();

        while (true){
            limparTela();
            System.out.println("*** LISTA DE TAREFAS ***");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Encerrar");
            System.out.println("Escolhe uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    System.out.println("Insira o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Insira a descricao da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(new Tarefa(titulo, descricao));
                    break;
                case 2:
                    gerenciador.listarTarefa();
                    break;
                case 3:
                    System.out.println("Digite o número da tarefa a ser marcada como realizada: ");
                    int tarefaIndex = scanner.nextInt() - 1;
                    gerenciador.marcarTarefaConcluida(tarefaIndex);
                    break;
                case 4:
                    System.out.println("Encerrando.....");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }

    private static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar a tela: " + e.getMessage());
        }
    }

}