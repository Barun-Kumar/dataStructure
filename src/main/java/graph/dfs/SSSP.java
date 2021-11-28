package graph.dfs;

import com.util.NumbersUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * SSSP -> Single source shortest path
 * The algorith works on tree
 */
public class SSSP {

    static List<List<Integer>> g=null;
    public static void main(String[] args) {
         g= Arrays.asList(
                Arrays.asList(),
                Arrays.asList(2),
                Arrays.asList(3,4,1),
                Arrays.asList(2),
                Arrays.asList(2,5,6,7,8,9),
                Arrays.asList(4),
                Arrays.asList(4),
                Arrays.asList(4),
                Arrays.asList(4),
                Arrays.asList(4)
        );

        for (int i=0;i<g.size();i++){
            System.out.println("Vertex :"+i+" : is connected with -> "+g.get(i));
        }
        int[] distanceList = new int[g.size()];
        boolean[] visited = new boolean[g.size()];

        //NumbersUtil.printArrayInSingleLine(distanceList);
        int startNode=2;
        int startDistance=0;
        bfs(startNode,startDistance,distanceList,visited);

        NumbersUtil.printArrayInSingleLine(distanceList);
        for (int i=0;i<distanceList.length;i++){
            System.out.println("Distance from :"+ startNode+" to "+i+" :"+distanceList[i]);
        }
    }

    public static void bfs(Integer node, Integer distance, int[] distanceList, boolean[] visited){
        visited[node]=true;
        distanceList[node]=distance;

        List<Integer> neighbours = g.get(node);
        for (Integer next: neighbours){
            if(!visited[next]){
                visited[next]=true;
                bfs(next,distanceList[node]+1,distanceList,visited);
            }
        }
    }
}
