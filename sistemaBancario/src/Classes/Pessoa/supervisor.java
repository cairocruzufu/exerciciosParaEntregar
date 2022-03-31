package Classes.Pessoa;

public class supervisor extends Funcionario {
    private boolean isSupervisor;

    public supervisor(String CPF, String nome, String estadoCivil, String dataNascimento, String cidade, String estado, int numFuncional, String telefone, String[] dependentes, String datadeAdimissão) {
        super(CPF, nome, estadoCivil, dataNascimento, cidade, estado, numFuncional, telefone, dependentes, datadeAdimissão, "");
        this.isSupervisor = true;
    }
}
