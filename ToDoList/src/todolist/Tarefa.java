
package todolist;


public class Tarefa {

    private String titulo;
    private String descricao;
    private boolean status;

    public Tarefa(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void tarefaConcluida(){
        this.status = true;
    }

    @Override
    public String toString(){
        return "[" + (status ? "X" : " ") + "] " + titulo + ": " + descricao;
    }

}
