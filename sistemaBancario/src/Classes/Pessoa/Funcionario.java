package Classes.Pessoa;
import Classes.Pessoa.supervisor;


public class Funcionario extends Pessoa {
    private int numFuncional;
    private String telefone;
    private String[] dependentes;
    private String nomeSupervisor;
    private String datadeAdimissão;

    public Funcionario(String CPF, String nome, String estadoCivil, String dataNascimento, String cidade, String estado
            , int numFuncional, String telefone, String[] dependentes, String datadeAdimissão, String nomeSupervisor) {
        super(CPF, nome, estadoCivil, dataNascimento, cidade, estado);
        this.numFuncional = numFuncional;
        this.telefone = telefone;
        this.dependentes = dependentes;
        this.datadeAdimissão = datadeAdimissão;
        this.nomeSupervisor = nomeSupervisor;
    }

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String telefone, String[] dependentes) {
    }

    public int getNumFuncional() {
        return numFuncional;
    }

    public void setNumFuncional(int numFuncional) {
        this.numFuncional = numFuncional;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String[] getDependentes() {
        return dependentes;
    }

    public void setDependentes(String[] dependentes) {
        this.dependentes = dependentes;
    }

    public String getNomeSupervisor() {
        return nomeSupervisor;
    }

    public void setNomeSupervisor(String nomeSupervisor) {
        this.nomeSupervisor = nomeSupervisor;
    }

    public String getDatadeAdimissão() {
        return datadeAdimissão;
    }

    public void setDatadeAdimissão(String datadeAdimissão) {
        this.datadeAdimissão = datadeAdimissão;
    }
}
