
public class Reserva {
    private String livro;
    private String usuario;
    private String dtRetirada;

    public Reserva(){}

    public Reserva(String livro, String usuario, String dtRetirada) {
        this.livro = livro;
        this.usuario = usuario;
        this.dtRetirada = dtRetirada;
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

    
}
