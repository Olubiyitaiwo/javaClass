package lists.in.java;

import java.util.Arrays;

public class ArrayList {
    private String[] array;
    private boolean isEmpty;
    private int size;
    private int capacity;

    public ArrayList() {
        capacity = 5;
        array = new String[capacity];
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void add(String element) {
        // array = [null, null, null, null, null]
        //           0      1     2    3    4
        // size = 0
        //element = school

        // array = ["school", null, null, null, null]
        //size = 1

        //element = bank
        // array = ["school", "bank", null, null, null]

        if (isFull()){
            expandArray();
        }
        array[size] = element;
        size++;
    }

    private void expandArray() {
        array = Arrays.copyOf(array, capacity * 2);
    }

    private boolean isFull() {
        return size + 1 == capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int School) {
        this.size = size;
    }

    public String getElementAtIndex(int index) {
        return array[index];
    }

    // if array.length + 2 = size
    //      increase capacity * 2
    //
}
