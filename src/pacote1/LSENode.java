package pacote1;

public class LSENode<T> {

    private T info;
    private LSENode<T> prox;

    public LSENode(T valor) {

        this.info = valor;
    }

    public T getInfo() {
        
        return info;
    }

    public void setInfo(T info) {

        this.info = info;
    }

    public LSENode<T> getProx() {

        return prox;
    }

    public void setProx(LSENode<T> novoProx) {

        this.prox = novoProx;
    }
    
}
