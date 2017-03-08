package recursiveSortingPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kasper
 */
public class CircularArrayList {

    private int[] elements = new int[2];
    private int nextInsert = 0; // next empty spot
    private int firstIndex = 0; // next element to be removed (if not empty)
    private int size = 0;

    private static int[] newIntArray(int size) {
        return new int[size];
    }

    public static CircularArrayList from(int[] elements) {
        CircularArrayList list = new CircularArrayList();
        list.elements = newIntArray(elements.length);
        for (int val : elements) {
            list.add(val);
        }
        return list;
    }

    public void clear() {
        nextInsert = 0;
        firstIndex = 0;
        size = 0;
    }

    private void ensureCapacity() {
        if (size < elements.length) {
            return;
        }
        int[] newElements = newIntArray(size + (size / 2) + 1);
        for (int i = 0; i < size; i++) {
            newElements[i] = this.get(i);
        }
        elements = newElements;
        firstIndex = 0;
        nextInsert = size;
    }

    public int get(int i) {
        return elements[(firstIndex + i) % elements.length];
    }

    public boolean add(int elem) {
        ensureCapacity();
        elements[nextInsert] = elem;
        nextInsert = (nextInsert + 1) % elements.length;
        size++;
        return true;
    }

    public int peek() {
        return elements[firstIndex];
    }

    public int poll() {
        int val = elements[firstIndex];
        firstIndex = (firstIndex + 1) % elements.length;
        size--;
        return val;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean addAll(CircularArrayList other) {
        for (int index = 0; index < other.size(); index++) {
            this.add(other.get(index));
        }
        return true;
    }

}
