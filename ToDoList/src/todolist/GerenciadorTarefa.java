
package todolist;


import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefa {

    private List<Tarefa> tarefas;
    public GerenciadorTarefa(){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public void listarTarefa(){
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa encontrada");
            return;
        }
        for(int i = 0; i < tarefas.size(); i++){
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }

    public void marcarTarefaConcluida(int index){
        if(index >= 0 && index < tarefas.size()){
            tarefas.get(index).tarefaConcluida();
            System.out.println("Tarefa concluida");
        } else {
            System.out.println("Selecione um registro valido");
        }
    }
}