package Classes;


public class listaEncadeada{
    private int tamanho;
    private No primeiroNo;
    private No ultimoNo;


    public listaEncadeada() {
        this.tamanho = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public No getPrimeiroNo() {
        return primeiroNo;
    }

    public void setPrimeiroNo(No primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public No getUltimoNo() {
        return ultimoNo;
    }

    public void setUltimoNo(No ultimoNo) {
        this.ultimoNo = ultimoNo;
    }


    //METODOS

    public void push_front(int value) {
        insert(0, value);
    }

    public void push_back(int value) {
        insert(size(), value);
    }

    public void insert(int pos, int value) {
        if (pos > tamanho) {
            throw new IllegalArgumentException(String.format("Posição Inválida [%d]", pos));
        }
        if (pos == 0) {
            No node = new No(value);
            node.setProximo(this.primeiroNo);
            this.primeiroNo = node;
        } else if (pos == this.size() - 1) {
            No node = new No(value);
            this.ultimoNo.setProximo(node);
            this.ultimoNo = node;
        } else {
            No noAnterior = recuperarNo(pos - 1);
            No noAtual = recuperarNo(pos);
            No novoNo = new No(value);
            noAnterior.setProximo(novoNo);
            novoNo.setProximo(noAtual);
        }
        this.tamanho++;
    }

    public void pop_front() {
        erase_pos(0);
    }

    public void pop_back() {
        erase_pos(size() - 1);
    }

    public int get_pos(int pos) {
        No no = recuperarNo(pos);
        if (no != null) {
            return no.getValue();
        } else {
            return Integer.parseInt(null);
        }
    }

    public boolean find_pos(int pos) {
        No currentNode = new No();
        if (pos > size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            currentNode = recuperarNo(i);
            if (currentNode.getValue() != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean find_data(int value) {
        for (int i = 0; i < size(); i++) {
            No currentNode = recuperarNo(i);
            if (currentNode.getValue() != 0 && currentNode.getValue() == value) {
                return true;
            }
        }
        return false;
    }

    public void erase_data(int value) {
        int pos = 0;
        for (int i = 0; i < size(); i++) {
            No currentNode = recuperarNo(i);
            if (currentNode.getValue() != 0 && currentNode.getValue() == value) {
                pos = i;
            }
        }
        erase_pos(pos);
    }

    public void erase_pos(int pos) {
        if (pos > size()) {
            throw new IllegalArgumentException(String.format("Posição Inválida [%d]", pos));
        }
        if (pos == 0) {
            No nexNode = recuperarNo(pos + 1);
            this.primeiroNo.setProximo(null);
            this.primeiroNo = nexNode;
        } else if (pos == size() - 1) {
            No penuNode = recuperarNo(size() - 2);
            penuNode.setProximo(null);
        } else {
            No currentNode = recuperarNo(pos);
            No previousNode = recuperarNo(pos - 1);
            No nextNode = recuperarNo(pos + 1);
            previousNode.setProximo(nextNode);
            currentNode.setProximo(null);
        }
        tamanho--;
    }

    public void insert_sort(No noMain) {
        ultimoNo = null;
        while (noMain != null) {
            No next = noMain.getProximo();
            sortedInsert(noMain);
            noMain = next;
        }
        primeiroNo = ultimoNo;
    }

    private void sortedInsert(No newNode) {
        if (ultimoNo == null || ultimoNo.getValue() >= newNode.getValue()) {
            newNode.setProximo(ultimoNo);
            ultimoNo = newNode;
        } else {
            No current = ultimoNo;

            while (current.getProximo() != null && current.getProximo().getValue() < newNode.getValue()) {

                current = current.getProximo();
            }
            newNode.setProximo(current.getProximo());
            current.setProximo(newNode);
        }
    }

    private No recuperarNo(int posicao) {
        if (posicao > size()) {
            throw new IllegalArgumentException(String.format("Posição Inválida [%d]", posicao));
        }
        No resultado = null;
        for (int i = 0; i <= posicao; i++) {
            if (i == 0) {
                resultado = this.primeiroNo;
            } else {
                resultado = resultado.getProximo();
            }
        }
        return resultado;
    }

    public int size() {
        return this.tamanho;
    }

    public int front(){
        int value  = get_pos(0);
        return value;
    }
    public  int back(){
        int value = get_pos(size()-1);
        return value;
    }

    public String print() {
        if (size() == 0) {
            return "Lista []";
        } else {
            No noAtual = this.primeiroNo;
            StringBuilder sb = new StringBuilder();
            sb.append("lista [");
            sb.append(noAtual.getValue() != 0 ? noAtual.getValue() : "<NULO>");
            sb.append(",");
            while (noAtual.getProximo() != null) {
                sb.append(noAtual.getProximo().getValue() != 0 ? noAtual.getProximo().getValue()
                        : "<NULO>");
                sb.append(",");
                noAtual = noAtual.getProximo();

            }
            sb.append("]");
            return sb.toString();
        }
    }
}