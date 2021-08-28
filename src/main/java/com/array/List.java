package com.array;

public interface List {

    void add(int value) throws Exception;

    void add(int position, int value);

    int get(int index);

    int remove(int value);

    boolean isEmpty();

    int size();

}