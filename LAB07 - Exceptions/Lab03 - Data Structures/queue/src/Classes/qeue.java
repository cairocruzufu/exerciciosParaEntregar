package Classes;

public class qeue {
    listaEncadeada qeue = new listaEncadeada();

    public void push(int value)
    {
            qeue.insert(size(),value);
    }

    public void pop(){
        if(qeue.size() == 0){
            throw new IllegalArgumentException();
        }else{
            qeue.pop_front();
        }
    }
    public int size()
    {
        return qeue.size();
    }

    public String print(){
        if (size() == 0) {
            return "Fila []";
        } else {
            No noAtual = this.qeue.getPrimeiroNo();
            StringBuilder sb = new StringBuilder();
            sb.append("Fila [");
            sb.append(noAtual.getValue() != 0 ? noAtual.getValue() : "<NULO>");
            sb.append(",");
            while (noAtual.getProximo() != null) {
                sb.append(noAtual .getProximo().getValue() != 0 ? noAtual.getProximo().getValue()
                        : "<NULO>");
                sb.append(",");
                noAtual = noAtual.getProximo();

            }
            sb.append("]");
            return sb.toString();
        }
    }

    public int front()
    {
       return qeue.front();
    }
}