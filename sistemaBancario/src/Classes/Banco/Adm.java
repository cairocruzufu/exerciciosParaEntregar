package Classes.Banco;

import Classes.Pessoa.Funcionario;

import java.util.ArrayList;

public class Adm extends Funcionario {
    public Adm(String CPF, String nome, String estadoCivil, String dataNascimento, String cidade, String estado, int numFuncional, String telefone, String[] dependentes, String datadeAdimissão, String nomeSupervisor) {
        super(CPF, nome, estadoCivil, dataNascimento, cidade, estado, numFuncional, telefone, dependentes, datadeAdimissão, nomeSupervisor);
    }

    ArrayList<Funcionario> adm = new ArrayList<Funcionario>();

    public void guardaAdm(String nome, String telefone, String[] dependentes) {
        Funcionario funcionario = new Funcionario(nome, telefone, dependentes);
        bancoAdm(funcionario);
    }

    public void bancoAdm(Funcionario fun) {
        adm.add(fun);
    }

}
