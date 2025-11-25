import java.io.Serializable;


public class GenericClass<T extends Comparable<T>, V extends Serializable, K> {

    private T t;
    private V v;
    private K k;


    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }


    public V getV() {
        return v;
    }


    public K getK() {
        return k;
    }


    public void printClassNames() {
        System.out.println("Class name of T: " + t.getClass().getName());
        System.out.println("Class name of V: " + v.getClass().getName());
        System.out.println("Class name of K: " + k.getClass().getName());
    }

}
