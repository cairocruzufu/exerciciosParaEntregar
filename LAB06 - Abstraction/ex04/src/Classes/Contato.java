package Classes;

public abstract class Contato {
    private String apelido;
    private String nome;
    private String email;
    private String dataNasc;

    public Contato(String apelido, String nome, String email, String dataNasc) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }


    public String imprimiBasico() {
        return "Contato{" +
                "Apelido='" + apelido + '\'' +
                ", Nome='" + nome + '\'' +
                ", Email='" + email + '\'' +
                ", Data de Nascimento='" + dataNasc + '\'' +
                '}';
    }

    public abstract String imprimirContato();
}
