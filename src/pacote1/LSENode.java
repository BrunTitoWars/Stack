public class LSENode<T> {

    private T info;
    private LSENode<T> topo;

    public T getInfo() {
        
        return info;
    }
    public void setInfo(T info) {

        this.info = info;
    }
    public LSENode<T> getTopo() {

        return topo;
    }
    public void setTopo(LSENode<T> topo) {

        this.topo = topo;
    }
    
}
