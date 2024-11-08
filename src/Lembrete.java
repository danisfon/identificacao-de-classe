public class Lembrete {
    private String usuario;
    private String conteudoMensagem;
    private String emprestimo;

    public Lembrete() {}

    public Lembrete(String usuario, String conteudoMensagem, String emprestimo) {
        this.usuario = usuario;
        this.conteudoMensagem = conteudoMensagem;
        this.emprestimo = emprestimo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getConteudoMensagem() {
        return conteudoMensagem;
    }

    public void setConteudoMensagem(String conteudoMensagem) {
        this.conteudoMensagem = conteudoMensagem;
    }

    public String getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(String emprestimo) {
        this.emprestimo = emprestimo;
    }

    
}
