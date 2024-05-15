package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private final List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adcionartarefa(String descricao){
      tarefaList.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTrefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        //Imprimindo número de tarefas
        System.out.println("O número total de tarefas é de " + listaTarefa.obterNumeroTotalTarefas());
        //Adicionando tarefas
        listaTarefa.adcionartarefa("tarefa 1");
        listaTarefa.adcionartarefa("tarefa 1");
        listaTarefa.adcionartarefa("tarefa 2");

        System.out.println("O número total de tarefas é de " + listaTarefa.obterNumeroTotalTarefas());
        //removendo tarefas
        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("O número total de elementos na lista é de " + listaTarefa.obterNumeroTotalTarefas());
        //imprimindo descrição das tarefas
        listaTarefa.obterDescricoesTrefas();
    }
}
