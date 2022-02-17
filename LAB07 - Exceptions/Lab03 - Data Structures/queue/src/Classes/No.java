package Classes;

public class No {
    private No proximo;
    private int value;

    public No(){
        this.proximo = null;
    }
    public No(int value){
        this.value = value;
        this.proximo = null;
    }
    public No (int value, No proximo){
        this.value = value;
        this.proximo = proximo;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
