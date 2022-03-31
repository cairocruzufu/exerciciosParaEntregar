package Classes.Pessoa;

public class Pessoa {
    private String CPF;
    private String nome;
    private String estadoCivil;
    private String dataNascimento;
    private String cidade;
    private String estado;

    public Pessoa() {

    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pessoa(String CPF, String nome, String estadoCivil, String dataNascimento, String cidade, String estado) {
        this.CPF = CPF;
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
        this.estado = estado;
    }
}
