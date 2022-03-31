package Classes.Banco;

import Classes.Interface.Itransacoes;

public class ContaCorrente extends Conta implements Itransacoes {
    private double taxaManutencao;

    public ContaCorrente(String numAgencia, String dataAberturaConta, String dataUltimaTransacao) {
        super(numAgencia, dataAberturaConta, dataUltimaTransacao);
        this.taxaManutencao = 20;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
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
