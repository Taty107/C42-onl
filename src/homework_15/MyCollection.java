package homework_15;

import java.util.Arrays;

public class MyCollection<E> {
    private Object[] elements;
    private int size;

    public MyCollection() {
        this.elements = new Object[10];
        this.size = 0;
    }

    public MyCollection(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("The length of a collection cannot be negative");
        } else {
            this.elements = new Object[initialCapacity];
            this.size = 0;
        }
    }

    public void addElement(E element) {
        increaseCapacity();
        elements[size++] = element;
    }

    public void deleteElement(int index) {
        checkIndex(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }

    @SuppressWarnings("unchecked")
    public E getElement(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public boolean containElement(E element) {
        for (int index = 0; index < size; index++) {
            if (element == null) {
                if (elements[index] == null) return true;
            } else {
                if (element.equals(elements[index])) return true;
            }
        }
        return false;
    }

    public void removeCollection() {
        for (int index = 0; index < size; index++) {
            elements[index] = null;
        }
        size = 0;
    }

    private void increaseCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Oops.. This index is not found..");
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int index = 0; index < size; index++) {
            stringBuilder.append(elements[index]);
            if (index < size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
