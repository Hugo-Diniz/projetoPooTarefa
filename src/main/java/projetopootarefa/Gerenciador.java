package projetopootarefa;
import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
    private Tarefa tarefa;

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public Gerenciador() {

    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
    
    public void adicionarTarefa(Tarefa novaTarefa) {
        tarefas.add(novaTarefa);
    }

    public void listarTarefas() {
        System.out.println("Suas Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.printf("{%d} - %s %n", i+1, tarefas.get(i).getTitulo());
        }
    }

    public void removerTarefa() {
        Scanner sc = new Scanner(System.in);
        listarTarefas();
        
        while(true) {
            System.out.printf("Qual tarefa você deseja remover? %n");
            int escolha = sc.nextInt();
            System.out.println();

            if (escolha > tarefas.size() || escolha < 1) {
                System.out.println("Opção inválida.");
            } else {
                tarefas.remove(escolha-1);
                break;
            }
        }
    }

    public void novaTarefa(Tarefa tarefinha) {
        this.tarefa = tarefinha;

    }
}
