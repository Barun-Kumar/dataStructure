package array;

import java.util.Iterator;

public class ArrayList<E> implements List<E> {
    private int len;
    private int capacity;
    private E[] arr;

    public ArrayList() {
        arr = (E[]) new Object[10];
        capacity = 10;
    }

    public ArrayList(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("List size can not be less of equals to zero");
        }
        arr = (E[]) new Object[size];
        capacity = size;
    }

    @Override
    public int size() {
        return len;
    }

    @Override
    public boolean isEmpty() {
        if (len == 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public boolean add(E element) {
        try {
            if (len + 1 >=capacity) {
                capacity*=2;
                E[] new_array = (E[]) new Object[capacity];
                for (int i = 0; i < arr.length; i++) {
                    new_array[i] = arr[i];
                }
                new_array[len] = element;
                arr=new_array;
            } else {
                arr[len] = element;
            }
            len++;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(E element) {
        boolean isRemoved=false;
        if(len!=0){
            int i=0,j=i+1;
            for( ;j<=len;i++,j++){
                if(arr[i].equals(element)){
                    arr[i]=arr[j];
                    isRemoved=true;
                }
            }
            arr[j]=null;
            if(isRemoved){
                len--;
            }
        }
        return isRemoved;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    public void print(){
        if(len==0){
            System.out.println("[]");
        }else{
            System.out.print("[");
           for(int i=0;i<len;i++){
               System.out.print(arr[i]+"|");
           }
            System.out.print("]");
        }
        System.out.println();
    }
}
