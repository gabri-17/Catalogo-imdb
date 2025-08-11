import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogo {
    private List<Filme> filmes;
    private List<Ator> atores;
    private List<Diretor> diretores;
    private Scanner scanner;

    public Catalogo() {
        this.filmes = new ArrayList<>();
        this.atores = new ArrayList<>();
        this.diretores = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    void exibirMenu() {
        int opcao = 1;

        do {
            System.out.print("\n------MENU------\n" +
                    "1. CADASTRAR" + '\n' +
                    "2. LISTAR" + '\n' +
                    "3. ALTERAR" + '\n' +
                    "4. DELETAR" + '\n' +
                    "0. SAIR" + '\n' +
                    "Escolhi => ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int opcaoSubMenu = mostrarSubMenu();
                    cadastrarInformacoes(opcaoSubMenu);
                    break;
                case 2:
                    listarCatalogo();
                    break;
                case 3:
                    //alterarCatalogo();
                    break;
                case 4:
                    //deletarCatalogo();
                    break;
                default:
                    System.out.println("Valor Inválido");
            }
        } while (opcao != 0);

    }

    int mostrarSubMenu(){

        int opcao = 1;

        do {
            System.out.print("\n-----SUBMENU-----" + '\n' +
                    "1. ATOR" + '\n' +
                    "2. DIRETO" + '\n' +
                    "3. FILME" + '\n' +
                    "0. VOLTAR"+ '\n' +
                    "Escolhi => ");
            return opcao = scanner.nextInt();
        }while (opcao !=0);

    }

    void cadastrarInformacoes(int opcaoSubMenu){
        if (opcaoSubMenu == 1 || opcaoSubMenu == 2){
            cadastrarPessoa(opcaoSubMenu);
        }
        cadastrarFilme();

    }

    void cadastrarPessoa(int opcaoSubMenu){
        System.out.println("Preencha a informações a seguir: ");
        System.out.print("Nome: ");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Gênero: ");
        String genero = scanner.nextLine();
        if (opcaoSubMenu == 1){
            System.out.print("CredencialDRT: ");
            int credencialDRT = scanner.nextInt();
            Ator ator = new Ator(nome, dataNascimento, genero, credencialDRT);
            this.atores.add(ator);
            System.out.println("Ator cadastrado com sucesso!");
        }

        if (opcaoSubMenu == 2){
            System.out.print("Credencial Diretor: ");
            int credencialDiretor = scanner.nextInt();
            Diretor diretor = new Diretor(nome, dataNascimento, genero, credencialDiretor);
            this.diretores.add(diretor);
            System.out.println("Diretor cadastrado com sucesso!");
        }

    }

    void cadastrarFilme(){

    }

    void listarCatalogo(){
        for (Ator ator: this.atores){
            System.out.println(ator.mostrarInfo());
        }
    }

}
