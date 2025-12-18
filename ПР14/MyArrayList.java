public class MyArrayList<E> {
    private Object[] data;
    private int size = 0;

    public MyArrayList() {
        data = new Object[10];
    }

    public void add(E value) {
        if (size == data.length)
            expand();
        data[size++] = value;
    }

    public E get(int index) {
        check(index);
        return (E) data[index];
    }

    public void set(int index, E value) {
        check(index);
        data[index] = value;
    }

    public E remove(int index) {
        check(index);
        E removed = (E) data[index];
        for (int i = index; i < size - 1; i++)
            data[i] = data[i + 1];
        size--;
        return removed;
    }

    public int size() {
        return size;
    }

    private void expand() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    private void check(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Неверный индекс: " + index);
    }
}
