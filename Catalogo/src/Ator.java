import java.time.LocalDate;
import java.util.List;

public class Ator {
    private String nome;
    private LocalDate dataNascimento;
    private String biografia;
    private List<Filme> filmesParticipados;

    public Ator(String nome, LocalDate dataNascimento, String biografia, List<Filme> filmesParticipados) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
        this.filmesParticipados = filmesParticipados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public List<Filme> getFilmesParticipados() {
        return filmesParticipados;
    }

    public void setFilmesParticipados(List<Filme> filmesParticipados) {
        this.filmesParticipados = filmesParticipados;
    }

    public void adicionarFilme(Filme filme) {
        if (filmesParticipados != null) {
            filmesParticipados.add(filme);
        }
    }
}
