package Classes.Banco;

import Classes.Interface.Itransacoes;

public class ContaPoupanca extends Conta implements Itransacoes {
    private double taxaDeJuros;

    public ContaPoupanca(String numAgencia, String dataAberturaConta, String dataUltimaTransacao) {
        super(numAgencia, dataAberturaConta, dataUltimaTransacao);
        this.taxaDeJuros = 0.05;
    }


    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public boolean saque(double val) {
        double aux;
        if (val > this.getSaldoCurrent()) {
            return false;
        } else {
            aux = this.getSaldoCurrent() - val;
            this.setSaldoCurrent(aux);
        }
        return true;
    }

    @Override
    public boolean transferencia(double val) {
        double aux;
        if (val > this.getSaldoCurrent()) {
            return false;
        } else {
            aux = this.getSaldoCurrent() - val;
            this.setSaldoCurrent(aux);
        }
        return true;
    }

    @Override
    public boolean deposito(double val) {
        double aux;
        if (val < 0) {
            return false;
        } else {
            aux = this.getSaldoCurrent() + val;
            this.setSaldoCurrent(aux);
        }
        return true;
    }

    @Override
    public boolean pagamento(double val) {
        double aux;
        if (val > this.getSaldoCurrent()) {
            return false;
        } else {
            aux = this.getSaldoCurrent() - val;
            this.setSaldoCurrent(aux);
        }
        return true;
    }
}
