package graph;

import java.util.Scanner;

public class GraphRepresenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v;int e;
        System.out.println("Inter no of vertices");
        v = sc.nextInt();
        System.out.println("Enter no of edges");
        e=sc.nextInt();

        System.out.println("Creating adjacency matrix for V*V");
        int[][] adj = new int[v+1][v+1];
        for(int i=0;i<e;i++){
            System.out.println("Enter the edge no "+(i+1));
            int start =sc.nextInt();
            int end= sc.nextInt();
            adj[start][end]=1;
            adj[end][start]=1;
        }

        for (int i=0;i<=v;i++){
            for (int j=0;j<=v;j++){
                System.out.print(adj[i][j]+" ");
            }
                System.out.println();
        }

    }
}
