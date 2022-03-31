package Classes.Banco;

import java.util.ArrayList;

public class Conta {
    private String numAgencia;
    private boolean ativa;
    private double saldoCurrent;
    private String dataAberturaConta;
    private String dataUltimaTransacao;
    private ArrayList<TransacoesImpl> historico;

    public String getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia) {
        this.numAgencia = numAgencia;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public double getSaldoCurrent() {
        return saldoCurrent;
    }

    public void setSaldoCurrent(double saldoCurrent) {
        this.saldoCurrent = saldoCurrent;
    }

    public String getDataAberturaConta() {
        return dataAberturaConta;
    }

    public void setDataAberturaConta(String dataAberturaConta) {
        this.dataAberturaConta = dataAberturaConta;
    }

    public String getDataUltimaTransacao() {
        return dataUltimaTransacao;
    }

    public void setDataUltimaTransacao(String dataUltimaTransacao) {
        this.dataUltimaTransacao = dataUltimaTransacao;
    }

    public ArrayList<TransacoesImpl> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<TransacoesImpl> historico) {
        this.historico = historico;
    }

    public Conta(String numAgencia, String dataAberturaConta, String dataUltimaTransacao) {
        this.numAgencia = numAgencia;
        this.ativa = true;
        this.saldoCurrent = 0;
        this.dataAberturaConta = dataAberturaConta;
        this.dataUltimaTransacao = dataUltimaTransacao;
    }

    public void registraHistorico(TransacoesImpl transImpl) {
        this.historico.add(transImpl);
    }
}
