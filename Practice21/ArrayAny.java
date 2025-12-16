public class ArrayAny<T> {
    private final T[] array;
    
    public ArrayAny(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", размер: " + array.length);
        }
        return array[index];
    }
    
    

}
