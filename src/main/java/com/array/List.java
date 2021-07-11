package com.array;

public interface List {

    public void add(int value) throws Exception;

    public void add(int position, int value);

    public int get(int index);

    public int remove(int value);

    public boolean isEmpty();

    public int size();

}