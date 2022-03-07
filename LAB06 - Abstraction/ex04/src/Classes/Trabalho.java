package Classes;

public class Trabalho extends Contato {
    private String tipo;

    public Trabalho(String apelido, String nome, String email, String dataNasc, String tipo) {
        super(apelido, nome, email, dataNasc);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String imprimiBasico() {
        return "Amigos{" +
                "Apelido='" + this.getApelido() + '\'' +
                ", Nome='" + this.getNome() + '\'' +
                ", Email='" + this.getEmail() + '\'' +
                ", Data de Nascimento=" + this.getDataNasc() + '\'' +
                ", Grau de amizade=" + getTipo() + '}';
    }

    @Override
    public String imprimirContato() {
        return imprimiBasico();
    }
}
