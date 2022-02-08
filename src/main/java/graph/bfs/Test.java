package graph.bfs;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static List<Boolean> visited = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("I am ");
        System.out.println(visited);
        for(Boolean v: visited){
            System.out.println(v);
        }
    }
}
