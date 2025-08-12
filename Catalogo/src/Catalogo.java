

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
        int opcao;

        do {
            System.out.print("\n---------MENU---------\n" +
                    "Escolha uma operação: " + '\n' + '\n' +
                    "1. CADASTRAR" + '\n' +
                    "2. ALTERAR" + '\n' +
                    "3. LISTAR" + '\n' +
                    "4. DELETAR" + '\n' +
                    "0. SAIR" + '\n' +
                    "Escolhi => ");

            opcao = scanner.nextInt();
            int opcaoSubMenu;

            switch (opcao) {

                case 1:
                    scanner.nextLine();
                    opcaoSubMenu = mostrarSubMenu();
                    cadastrar(opcaoSubMenu);
                    break;
                case 2:
                    scanner.nextLine();
                    opcaoSubMenu = mostrarSubMenu();
                    alterar(opcaoSubMenu);
                    break;
                case 3:
                    scanner.nextLine();
                    opcaoSubMenu = mostrarSubMenu();
                    listar(opcaoSubMenu);
                    break;
                case 4:
                    scanner.nextLine();
                    opcaoSubMenu = mostrarSubMenu();
                    deletar(opcaoSubMenu);
                    break;
                case 0:
                    System.out.println("Saindoooooo...");
                    break;
                default:
                    System.out.println("Valor inválido.");
                    break;
            }
        } while (opcao != 0 && opcao <= 4);

    }

    int mostrarSubMenu() {

        int opcao = 1;

        do {
            System.out.print("\n-----SUBMENU-----" + '\n' +
                    "Escolha um item: " + '\n' + '\n' +
                    "1. ATOR" + '\n' +
                    "2. DIRETOR" + '\n' +
                    "3. FILME" + '\n' +
                    "4. VOLTAR" + '\n' +
                    "0. SAIR" + '\n' +
                    "Escolhi => ");
            if (opcao == 4) {
                exibirMenu();
            }
            return opcao = scanner.nextInt();
        } while (opcao != 0 && opcao < 5);
    }

    void adicionarObjetoJáConstruido(Ator ator){
        this.atores.add(ator);
        System.out.println("Adicionado");
    }

    void adicionarObjetoJáConstruido(Diretor diretor){
        this.diretores.add(diretor);
    }

    void adicionarObjetoJáConstruido(Filme filme){
        this.filmes.add(filme);
    }
    void cadastrar(int opcaoSubMenu) {
        if (opcaoSubMenu == 1) {
            System.out.println("Preencha as informações a seguir:");
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();
            System.out.print("Gênero: ");
            String genero = scanner.nextLine();
            System.out.print("Credencial DRT: ");
            int credencialDRT = scanner.nextInt();
            Ator ator = new Ator(nome, dataNascimento, genero, credencialDRT);
            this.atores.add(ator);
            System.out.println("Ator cadastrado com sucesso!");
        }

        if (opcaoSubMenu == 2) {
            System.out.println("Preencha as informações a seguir:");
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();
            System.out.print("Gênero: ");
            String genero = scanner.nextLine();
            System.out.print("Credencial Diretor: ");
            int credencialDiretor = scanner.nextInt();
            Diretor diretor = new Diretor(nome, dataNascimento, genero, credencialDiretor);
            this.diretores.add(diretor);
            System.out.println("Diretor cadastrado com sucesso!");
        }

        if (opcaoSubMenu == 3) {
            System.out.println("Preencha as informações a seguir:");
            scanner.nextLine();
            System.out.print("Nome do Filme: ");
            String nome = scanner.nextLine();
            System.out.print("Data de Lançamento: ");
            String dataLancamento = scanner.nextLine();
            System.out.print("Orçamento: ");
            double orcamento = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Descrição: ");
            String descricao = scanner.nextLine();
            Filme filme = new Filme(nome, dataLancamento, orcamento, descricao);
            this.filmes.add(filme);
            System.out.println("Filme cadastrado com sucesso!");
        }
    }

    void alterar(int opcaoSubMenu) {

        if (opcaoSubMenu == 1) {
            System.out.println("Digite o nome do ator que deseja alterar:");
            String nomePesquisa = scanner.nextLine();
            boolean encontrado = false;
            for (Ator ator : this.atores) {
                if (ator.getNome().equalsIgnoreCase(nomePesquisa)) {
                    System.out.println("Ator encontrado. Preencha as novas informações:");
                    System.out.print("Novo Nome: ");
                    String novoNome = scanner.nextLine();
                    ator.setNome(novoNome);
                    System.out.print("Nova Data de Nascimento: ");
                    String novaDataNascimento = scanner.nextLine();
                    ator.setDataNascimento(novaDataNascimento);
                    System.out.print("Novo Gênero: ");
                    String novoGenero = scanner.nextLine();
                    ator.setGenero(novoGenero);
                    System.out.print("Nova Credencial DRT: ");
                    int novaCredencialDRT = scanner.nextInt();
                    ator.setCredencialDRT(novaCredencialDRT);
                    System.out.println("Ator alterado com sucesso!");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Ator não encontrado.");
            }
        }

        if (opcaoSubMenu == 2) {
            System.out.println("Digite o nome do diretor que deseja alterar:");
            String nomePesquisa = scanner.nextLine();
            boolean encontrado = false;
            for (Diretor diretor : this.diretores) {
                if (diretor.getNome().equalsIgnoreCase(nomePesquisa)) {
                    System.out.println("Diretor encontrado. Preencha as novas informações:");
                    System.out.print("Novo Nome: ");
                    String novoNome = scanner.nextLine();
                    diretor.setNome(novoNome);
                    System.out.print("Nova Data de Nascimento: ");
                    String novaDataNascimento = scanner.nextLine();
                    diretor.setDataNascimento(novaDataNascimento);
                    System.out.print("Novo Gênero: ");
                    String novoGenero = scanner.nextLine();
                    diretor.setGenero(novoGenero);
                    System.out.print("Nova Credencial Diretor: ");
                    int novaCredencialDiretor = scanner.nextInt();
                    diretor.setCredencialDiretor(novaCredencialDiretor);
                    System.out.println("Diretor alterado com sucesso!");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Diretor não encontrado.");
            }
        }

        if (opcaoSubMenu == 3) {
            System.out.println("Digite o nome do filme que deseja alterar:");
            String nomePesquisa = scanner.nextLine();
            boolean encontrado = false;
            for (Filme filme : this.filmes) {
                if (filme.getNome().equalsIgnoreCase(nomePesquisa)) {
                    System.out.println("Filme encontrado. Preencha as novas informações:");
                    System.out.print("Novo Título: ");
                    String novoNome = scanner.nextLine();
                    filme.setNome(novoNome);
                    System.out.print("Nova Data de Lançamento: ");
                    String novaDataLancamento = scanner.nextLine();
                    filme.setDataLancamento(novaDataLancamento);
                    System.out.print("Novo Orçamento: ");
                    double novoOrcamento = scanner.nextDouble();
                    scanner.nextLine(); // Consome a nova linha pendente
                    System.out.print("Nova Descrição: ");
                    String novaDescricao = scanner.nextLine();
                    filme.setDescricao(novaDescricao);
                    System.out.println("Filme alterado com sucesso!");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Filme não encontrado.");
            }
        }
    }

    void listar(int opcaoSubMenu) {

        if (opcaoSubMenu == 1) {
            if (this.atores.isEmpty()) {
                System.out.println("Nenhum ator cadastrado.");
            } else {
                System.out.println("--- Lista de Atores ---");
                for (Ator ator : this.atores) {
                    System.out.println(ator.mostrarInfo());
                }
            }
        }

        if (opcaoSubMenu == 2) {
            if (this.diretores.isEmpty()) {
                System.out.println("Nenhum diretor cadastrado.");
            } else {
                System.out.println("--- Lista de Diretores ---");
                for (Diretor diretor : this.diretores) {
                    System.out.println(diretor.mostrarInfo());
                }
            }
        }

        if (opcaoSubMenu == 3) {
            if (this.filmes.isEmpty()) {
                System.out.println("Nenhum filme cadastrado.");
            } else {
                System.out.println("--- Lista de Filmes ---");
                for (Filme filme : this.filmes) {
                    System.out.println(filme.mostrarInfo());
                }
            }
        }
    }

    void deletar(int opcaoSubMenu) {

        if (opcaoSubMenu == 1) {
            System.out.println("Digite o nome do ator que deseja deletar:");
            String nomePesquisa = scanner.nextLine();
            boolean removido = false;
            // Usa um Iterator para remover o item de forma segura enquanto itera
            for (Ator ator : this.atores) {
                if (ator.getNome().equalsIgnoreCase(nomePesquisa)) {
                    this.atores.remove(ator);
                    System.out.println("Ator '" + nomePesquisa + "' deletado com sucesso!");
                    removido = true;
                    break;
                }
            }
            if (!removido) {
                System.out.println("Ator não encontrado.");
            }
        }

        if (opcaoSubMenu == 2) {
            System.out.println("Digite o nome do diretor que deseja deletar:");
            String nomePesquisa = scanner.nextLine();
            boolean removido = false;
            for (Diretor diretor : this.diretores) {
                if (diretor.getNome().equalsIgnoreCase(nomePesquisa)) {
                    this.diretores.remove(diretor);
                    System.out.println("Diretor '" + nomePesquisa + "' deletado com sucesso!");
                    removido = true;
                    break;
                }
            }
            if (!removido) {
                System.out.println("Diretor não encontrado.");
            }
        }

        if (opcaoSubMenu == 3) {
            System.out.println("Digite o nome do filme que deseja deletar:");
            String nomePesquisa = scanner.nextLine();
            boolean removido = false;
            for (Filme filme : this.filmes) {
                if (filme.getNome().equalsIgnoreCase(nomePesquisa)) {
                    this.filmes.remove(filme);
                    System.out.println("Filme '" + nomePesquisa + "' deletado com sucesso!");
                    removido = true;
                    break;
                }
            }
            if (!removido) {
                System.out.println("Filme não encontrado.");
            }
        }
    }
}
