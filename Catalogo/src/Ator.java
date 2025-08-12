import java.util.ArrayList;
import java.util.List;

public class Ator extends Pessoa{
    private int credencialDRT;
    private List<Filme> filmes;

    public Ator(String nome, String dataNascimento, String genero, int credencialDRT) {
        super(nome, dataNascimento, genero);
        this.credencialDRT = credencialDRT;
        this.filmes = new ArrayList<>();
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public int getCredencialDRT() {
        return credencialDRT;
    }

    public void setCredencialDRT(int credencialDRT) {
        this.credencialDRT = credencialDRT;
    }

    public String mostrarInfo() {
        return  "Nome: " + this.getNome() + '\n' +
                "Data de Nascimento: " + this.getDataNascimento() + '\n' +
                "Gênero: " + this.getGenero() + '\n' +
                "CredencialDRT" + this.credencialDRT + '\n';
    }
}