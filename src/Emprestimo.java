
public class Emprestimo {
    private String livro;
    private String usuario;
    private String dtRetirada;
    private String dtDevolucao;

    public Emprestimo() {}

    public Emprestimo(String livro, String usuario, String dtRetirada, String dtDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dtRetirada = dtRetirada;
        this.dtDevolucao = dtDevolucao;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDtRetirada() {
        return dtRetirada;
    }

    public void setDtRetirada(String dtRetirada) {
        this.dtRetirada = dtRetirada;
    }

    public String getDtDevolucao() {
        return dtDevolucao;
    }

    public void setDtDevolucao(String dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }
    
}
