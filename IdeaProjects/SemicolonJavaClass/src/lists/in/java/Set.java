package lists.in.java;

public class Set {
    public boolean isRemoved;
    private int[] array = new int[6];
    private boolean isEmpty;
    private int size;
    private boolean checkDuplicate;


    public boolean isEmpty() {
        return size == 0;
    }


    public void add(int element) {
        if (!isEmpty) {
            array[size] = element;
        }
        size++;
    }

    public int getsize(int[] elements) {

        return elements.length;
    }

    public void setSize(int[] elements) {
        this.size = elements.length;
        for (int i = 0; i < elements.length; i++) {
            array[i] = elements[i];
        }

    }

    public boolean isRemoved(int elements) {
        for (int count = 0; count < size; count++) {
            if (array[count] == elements) {
                array[count] = array[--size];
                array[count] = 0;
                return true;
            }
        }
        return false;
    }

}

