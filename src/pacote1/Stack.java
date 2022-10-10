package pacote1;

public class Stack<T> {

    LSENode<T> topo;

    public boolean isEmpty(){

        if(this.topo == null){

            return true;
        }else{

            return false;
        }
    }

    public void push(T valor){ // Empilhar

        LSENode<T> novo = new LSENode<T>(valor);
        novo.setProx(this.topo);
        this.topo = novo;
    }
    
    public boolean isFull(){

        return false;
    }

    public T pop(){ // Desempilhar

        LSENode<T> aux = this.topo;
        this.topo = this.topo.getProx();
        return aux.getInfo();
    }

    public T top(){ // O que está no Topo

        return this.topo.getInfo();
    }
    
}
