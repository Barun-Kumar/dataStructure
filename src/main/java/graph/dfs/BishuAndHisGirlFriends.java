package graph.dfs;

import com.util.NumbersUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BishuAndHisGirlFriends {

    public static void dfs(ArrayList<ArrayList<Integer>> g,int node, int dist,boolean[]visited,int[]distance){
        if(visited[node]){
            return;
        }
        visited[node]=true;
        distance[node]=dist;
        ArrayList<Integer> neighbours = g.get(node);
        for(Integer next:neighbours){
            if(!visited[next]){
                dfs(g,next,distance[node]+1,visited,distance);
            }
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of cities");
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer> > g= new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i <=n; i++)
            g.add(new ArrayList<Integer>());
        for(int i=1;i<=n-1;i++){
            System.out.println("Enter which city is connected with which city");
            System.out.println("Enter start city");
            int u= sc.nextInt();
            System.out.println("Enter end city");
            int v= sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }

        for(List<Integer> e: g){
            System.out.println(e);
        }

        boolean[] visited = new boolean[g.size()];
        int[] distance = new int[g.size()];
        int startNode=1;
        int dist=0;
        dfs(g,startNode,dist,visited,distance);

        NumbersUtil.printArrayInSingleLine(distance);

    }
}
