package Classes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Date;



public class Conta {

    ArrayList<String> contas = new ArrayList();
    private String NumeroIdentificacao;
    Date DataCriacao = new Date(); //nao sei se é assim mas precisamos guardar a data de criacao; antes tinha criado uma variavel datacriacao mas n sei
    Date DataUltimoAcesso = new Date(); //mesma coisa aqui

    public abstract class ResgatarNumeroIdentificacao{

    }

    public abstract class ResgatarSaldo{

    }

    public abstract class PagaEmprestimo{

    }

    public abstract class NumeroEmprestimo{

    }

    public abstract class ParcelasEmprestimo{

    }

    public abstract class QuantiaEmprestimo{

    }

    public abstract class Sorteio{

    }

    public abstract class CriarConta{

    }

    public abstract class FazerEmprestimo{

    }


}
