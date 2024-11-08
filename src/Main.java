import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List <Livro> livros = new ArrayList<>();
    static List <Usuario> usuarios = new ArrayList<>();
    static List <Emprestimo> emprestimos = new ArrayList<>();
    static List <Lembrete> lembretes = new ArrayList<>();
    static List <Reserva> reservas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
       
        int opcao;

        do {
            menu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            listaCadastrar(opcao);
        } while (opcao != 0);

    }

    public static void menu() {
        System.out.println("***********************************");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Cadastrar Usuário");
        System.out.println("3 - Cadastrar Empréstimo");
        System.out.println("4 - Cadastrar Lembretes");
        System.out.println("5 - Cadastrar Reserva");
        System.out.println("6 - Relatório de Livros");
        System.out.println("7 - Relatório de Usuários");
        System.out.println("8 - Relatório de Empréstimos");
        System.out.println("9 - Relatório de Notificações");
        System.out.println("10 - Relatório de Reservas");
        System.out.println("0 - Sair");
        System.out.println("***********************************");
    }


    public static void listaCadastrar(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarLivro();
                break;
            case 2:
                cadastrarUsuario();
                break;
            case 3:
                cadastrarEmprestimo();
                break;
            case 4:
                cadastrarLembrete();
                break;
            case 5:
                cadastrarReserva();
                break;
            case 6:
                relatorioLivros();
                break;
            case 7:
                relatorioUsuarios();
                break;
            case 8:
                relatorioEmprestimos();
                break;
            case 9:
                relatorioLembrete();
                break;
            case 10:
                relatorioReservas();
                break;
            default:
                if (opcao != 0) {
                    System.out.println("Opção inválida!");
                }
                break;
        }
    }

    //ok
    public static void cadastrarLivro() {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Digite a editora do livro:");
        String editora = scanner.nextLine();

        System.out.println("Digite a categoria do livro:");
        String categoria = scanner.nextLine();

        Livro livro = new Livro(titulo, autor, editora, categoria);
        livros.add(livro);
    }

    //ok
    public static void cadastrarEmprestimo() {
        System.out.println("Digite o livro:");
        String livro = scanner.nextLine();

        System.out.println("Digite o usuário:");
        String usuario = scanner.nextLine();

        System.out.println("Digite a data de retirada:");
        String dtRetirada = scanner.nextLine();

        System.out.println("Digite a data de devolução:");
        String dtDevolucao = scanner.nextLine();

        Emprestimo emprestimo = new Emprestimo(livro, usuario, dtRetirada, dtDevolucao);
        emprestimos.add(emprestimo);
    }

    //ok
    public static void cadastrarLembrete() {
       System.out.println("Digite o usuario:");
        String usuario = scanner.nextLine();

        System.out.println("Digite o conteudo da mnesagem:");
        String conteudoMensagem = scanner.nextLine();

        System.out.println("Digite o valor do emprestimo:");
        String emprestimo = scanner.nextLine();

        Lembrete lembrete = new Lembrete(usuario, conteudoMensagem, emprestimo);
        lembretes.add(lembrete);
    }

    //ok
    public static void cadastrarUsuario() {
        System.out.println("Digite o nome do usuario:");
        String nome = scanner.nextLine();

        System.out.println("Digite o email do usuario:");
        String email = scanner.nextLine();

        System.out.println("Digite a tipo do usuario:");
        String tipo = scanner.nextLine();

        Usuario usuario = new Usuario(nome, email, tipo);
        usuarios.add(usuario);
    }

    //ok
    public static void cadastrarReserva() {
        System.out.println("Digite o livro da reserva:");
        String livro = scanner.nextLine();

        System.out.println("Digite o usuario da reserva:");
        String usuario = scanner.nextLine();

        System.out.println("Digite a data da retirada da reserva:");
        String dtRetirada = scanner.nextLine();

        Reserva reserva = new Reserva(livro, usuario, dtRetirada);
        reservas.add(reserva);
    }

    //ok
    public static void relatorioLivros() {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println("Categoria: " + livro.getCategoria());
            System.out.println();
        }
    }

    //ok
    public static void relatorioUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Tipo: " + usuario.getTipo());
            System.out.println();
        }
    }

    //ok
    public static void relatorioEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println("Livro do emprestimo: " + emprestimo.getLivro());
            System.out.println("usurio: " + emprestimo.getUsuario());
            System.out.println("Data retirada: " + emprestimo.getDtRetirada());
            System.out.println("Data devolucao: " + emprestimo.getDtDevolucao());
            System.out.println();
        }
    }

    //ok
    public static void relatorioLembrete() {
        for (Lembrete notificacao : lembretes) {
            System.out.println("Usuario que será enviado: " + notificacao.getUsuario());
            System.out.println("Conteudo da mensagem: " + notificacao.getConteudoMensagem());
            System.out.println("Emprestimo referente: " + notificacao.getEmprestimo());
            System.out.println();
        }
    }

    //ok
    public static void relatorioReservas() {
        for (Reserva reserva : reservas) {
            System.out.println("Livro da reserva: " + reserva.getLivro());
            System.out.println("Data da retirada prevista: " + reserva.getDtRetirada());
            System.out.println("Quem irá retirar: " + reserva.getUsuario());
            System.out.println();
        }
    }
}