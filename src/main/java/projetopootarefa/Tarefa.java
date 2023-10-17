package projetopootarefa;
import java.util.Date;

public class Tarefa {
    private String titulo;
    private String descricao;
    private Date prazoConclusao;
    private String prioridade;
    private boolean status;
    private String categoria;

    public Tarefa(String titulo, String descricao, Date prazoConclusao, String prioridade, boolean status, String categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazoConclusao = prazoConclusao;
        this.prioridade = prioridade;
        this.status = status;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getPrazoConclusao() {
        return prazoConclusao;
    }

    public void setPrazoConclusao(Date prazoConclusao) {
        this.prazoConclusao = prazoConclusao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }    
}
