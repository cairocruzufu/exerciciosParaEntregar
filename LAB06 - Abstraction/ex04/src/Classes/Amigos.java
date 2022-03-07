package Classes;

public class Amigos extends Contato {
    private int grau;
    private String GrauString;

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public String getGrauString() {
        return GrauString;
    }

    public void setGrauString(String grauString) {
        GrauString = grauString;
    }

    public Amigos(String apelido, String nome, String email, String dataNasc, int grau) {
        super(apelido, nome, email, dataNasc);
        this.grau = grau;
    }

    protected void converteGrau() {
        if (getGrau() == 1) {
            setGrauString(" Melhor amigo");
        } else if (getGrau() == 2) {
            setGrauString(" Amigo");
        } else if (getGrau() == 3) {
            setGrauString(" Conhecido");
        }
    }

    public String imprimiBasico() {
        converteGrau();
        return "Amigos{" +
                "Apelido='" + this.getApelido() + '\'' +
                ", Nome='" + this.getNome() + '\'' +
                ", Email='" + this.getEmail() + '\'' +
                ", Data de Nascimento=" + this.getDataNasc() + '\'' +
                ", Grau de amizade=" + getGrauString() + '}';
    }

    @Override
    public String imprimirContato() {
        return imprimiBasico();
    }
}
