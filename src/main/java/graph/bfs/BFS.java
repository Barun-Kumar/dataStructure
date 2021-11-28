package graph.bfs;
import com.util.NumbersUtil;
import graph.AdjacencyList;

import java.util.*;

public class BFS {

    public static List<Integer> bfs(List<List<Integer>> g, int start, int end){
        List<Integer> prev =null;
        prev = solve(start,g);
        System.out.println("Before reconstructing :"+prev);
        List<Integer> path =reConstructPath(prev,start,end);
        return path;
    }

    private static List<Integer> reConstructPath(List<Integer> prev, int start, int end) {
        List<Integer> path = new ArrayList<>();
        Integer at=end;
        while (at!=null){
            path.add(at);
            at=prev.get(at);
        }

        Collections.reverse(path);
        if(path.get(0)==start){
            return path;
        }else{
            System.out.println("Still returning path");
            return path;
        }
    }


    public static List<Integer> solve(int start,List<List<Integer>> g){
        boolean[] visited = new boolean[g.size()+1];
        List<Integer> prev =null;
        Integer[]tempPrev = new Integer[visited.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            List<Integer> neighbours = g.get(node);
            for (Integer next: neighbours){
                if(visited[next]==false){
                    visited[next]=true;
                    q.add(next);
                    tempPrev[next]=node;
                   // NumbersUtil.printArrayInSingleLine(tempPrev);
                }
            }
        }
        prev=Arrays.asList(tempPrev);
        //NumbersUtil.printArrayInSingleLine(tempPrev);
        return prev;
    }
    public static void main(String[] args) {
        List<List<Integer>> g = AdjacencyList.createPreDefinedGraph();
        for (List n:g) {
            System.out.println(n);
        }

        List<Integer> path = bfs(g,5,8);
        System.out.println(path);
    }
}
