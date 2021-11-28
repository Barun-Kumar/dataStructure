package graph.dfs;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class DFS {
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
                Arrays.asList(2),
                Arrays.asList(1, 3, 4),
                Arrays.asList(2, 5),
                Arrays.asList(2),
                Arrays.asList(3, 6, 7),
                Arrays.asList(5),
                Arrays.asList(5)
        );
        visited= new boolean[g.size()+1];
        Integer start = 1;
        List<Integer> result = dfs(start);
        System.out.println(result);


    }


}
