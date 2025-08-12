
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String genero;

    public Pessoa(String nome, String dataNascimento, String genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String mostrarInfo() {
        return "Nome='" + nome + '\n' +
                "DataNascimento='" + dataNascimento + '\n' +
                "Genero='" + genero + '\n';
    }
}
