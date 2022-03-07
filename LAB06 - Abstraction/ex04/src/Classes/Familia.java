package Classes;

public class Familia extends Contato {
    private String parentesco;

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Familia(String apelido, String nome, String email, String dataNasc, String parentesco) {
        super(apelido, nome, email, dataNasc);
        this.parentesco = parentesco;
    }

    public String imprimiBasico() {
        return "Familiar{" +
                "Apelido='" + this.getApelido() + '\'' +
                ", Nome='" + this.getNome() + '\'' +
                ", Email='" + this.getEmail() + '\'' +
                ", Data de Nascimento=" + this.getDataNasc() + '\'' +
                ", Grau de Parentesco=" + getParentesco() + '}';
    }

    @Override
    public String imprimirContato() {
        return imprimiBasico();
    }


}
