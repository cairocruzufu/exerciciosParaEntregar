package Classes.Banco;

import java.util.UUID;

public class TransacoesImpl {
    private String tipo;
    private int descricao;
    private String data;
    private double valor;
    private String verificador;

    public TransacoesImpl(String tipo, int descricao, String data, double valor) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
        this.verificador = geraVerificador();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getVerificador() {
        return verificador;
    }

    public void setVerificador(String verificador) {
        this.verificador = verificador;
    }

    public String geraVerificador() {
        UUID id = UUID.randomUUID();
        return String.valueOf(id);
    }
}
