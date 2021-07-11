package com.array;

public class Main {

    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        for(int i=0;i<=100000;i++){
          l.add(i);
         }

        for(int i=0;i<=l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
