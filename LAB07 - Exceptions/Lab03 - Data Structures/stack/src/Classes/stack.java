package Classes;

public class stack {
    listaEncadeada stack = new listaEncadeada();

    public void push (int value){
        stack.insert(size(),value);
    }
    public int size(){
        return stack.size();
    }
    public void pop(){
        stack.pop_back();
    }
    public  int top(){
        return stack.back();
    }
    public String print(){
        if (size() == 0) {
            return "Pilha []";
        } else {
            No noAtual = this.stack.getPrimeiroNo();
            StringBuilder sb = new StringBuilder();
            sb.append("Pilha [");
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
}
