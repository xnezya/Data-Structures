public class TNode<T extends Comparable> {
    public T value;
    public TNode<T> left;
    public TNode<T> right;

    public TNode(T val){
        this.value = val;
        this.left = this.right = null;
    }
    // public String to String() { return this.value.toString();}
}
