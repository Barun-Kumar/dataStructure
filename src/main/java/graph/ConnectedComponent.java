package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConnectedComponent {
    static List<List<Integer>> g;
    static boolean visited[] =null;
    static List path = new ArrayList();
    private static List<Integer> dfs(Integer v) {
        visited[v]=true;
        path.add(v);
        List<Integer> neighbours = g.get(v);
        for (Integer next: neighbours){
            if (!visited[next]){
                dfs(next);
            }
        }
        return path;
    }
    public static void main(String[] args) {
        g = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(2,3),
                Arrays.asList(1),
                Arrays.asList(4, 5),
                Arrays.asList(3),
                Arrays.asList(3),
                Arrays.asList(7),
                Arrays.asList(6,8),
                Arrays.asList(7),
                Arrays.asList(10),
                Arrays.asList(9,11),
                Arrays.asList(10,12),
                Arrays.asList(11)
        );


        visited= new boolean[g.size()+1];
        int count=0;
        for(int i=1;i<g.size();i++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println("Visited order");
        System.out.println(path);
        System.out.println("No of connected component :"+count);

       // Collections.reverse();

    }
}
