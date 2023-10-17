package projetopootarefa;
import java.util.Date;

public class Main {
    Date data = new Date(2023,10,30); 
    Tarefa tarefa1 = new Tarefa("Compras", "Lista de compras", data, "maxima", false, "casa");
    Tarefa tarefa2 = new Tarefa("Pagar conta", "Pagamento da conta de luz", data, "maxima", true, "casa");  


    Gerenciador gerenciar = new Gerenciador();
    gerenciar.novaTarefa(tarefa1);

}
