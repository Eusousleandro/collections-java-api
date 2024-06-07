package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;


    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefas(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elemento na lista é: " + listaTarefa.obterNumeroDeTarefas());

        listaTarefa.adicionarTarefas("Tarefa 1");
        listaTarefa.adicionarTarefas("Tarefa 2");
        listaTarefa.adicionarTarefas("Tarefa 3");
        System.out.println("O número total de elemento na lista é: " + listaTarefa.obterNumeroDeTarefas());


        listaTarefa.removerTarefas("Tarefa 1");
        System.out.println("O número total de elemento na lista é: " + listaTarefa.obterNumeroDeTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
