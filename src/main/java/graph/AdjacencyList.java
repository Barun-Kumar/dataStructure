package graph;

import java.util.*;
import java.util.stream.IntStream;
import static java.util.Arrays.*;

public class AdjacencyList {

    public static List<ArrayList<Integer>> createGraph(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of vertex");
        int noOfVertex=sc.nextInt();
        System.out.println("Enter the starting vertex index");
        int startVertex = sc.nextInt();
        //int noOfEdges= sc.nextInt();
        List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(noOfVertex);

        //IntStream range = IntStream.range(startVertex,noOfVertex+1);
        //range.forEach(e->graph.;
//        for(int i=1;i<=graph.size();i++){
//            graph.get(i).add(i);
//        }
//        System.out.println("Vertices in the graph are\n"+graph);

      for(int i=startVertex;i<=noOfVertex;i++){
            System.out.println("Enter no of adjacent vertices of vertex:"+i);
            int n=sc.nextInt();
            System.out.println("Enter all adjacent vertex for vertex no :"+startVertex);
            ArrayList<Integer> edges = new ArrayList<>();
            for(int j=0;j<n;j++){
                System.out.println("Enter :"+(j+1)+" vertex");
                int v= sc.nextInt();
                edges.add(v);
            }
          graph.add(edges);
      }
    return graph;
    }

    public static void printGraph(List<List<Integer>> graph){
        for(List<Integer> vertex: graph){
            System.out.println(vertex);
        }
    }

  /*  public static List<List<Integer>> createPreDefinedGraph(){
        List<List<Integer>> g = asList(
                asList(),
                asList( 2, 4, 6 ),
                asList( 1, 4, 3 ),
                asList( 2, 7, 5, 4 ),
                asList(1, 2, 3, 5, 6),
                asList(4, 3, 6, 7),
                asList(1, 4, 5),
                asList(3, 5)
        );

        return g;
    }*/

    public static List<List<Integer>> createPreDefinedGraph(){
        List<List<Integer>> g = asList(
                asList(),
                asList( 2, 3, 4 ),
                asList( 1, 6, 8,9 ),
                asList( 1,5 ),
                asList(1,7),
                asList(3,6),
                asList(2,7),
                asList(4, 6, 8),
                asList(2,9),
                asList(2,8,7)
        );

        return g;
    }

    public static List<Integer> bfs(List<List<Integer>> g, int startVertex)  {
        List<Integer> res= new ArrayList<>();
        if(g==null || g.isEmpty()){
            return res;
        }else{
            ArrayList<Boolean> isVisited = new ArrayList<>(g.size());
            for (int i=0;i<=g.size();i++){
                isVisited.add(false);
            }

            for(int i=startVertex; i<g.size();i++) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
              //  if (isVisited.get(i) == false) {
                    isVisited.set(i, true);
                    res.add(i);
                    while (!queue.isEmpty()) {
                       // System.out.println(queue);
                        Integer v = queue.poll();
                            List<Integer> adjacents = g.get(v);
                            System.out.println(v + " Adjacent " + adjacents);
                            for (Integer adjacent : adjacents) {
                                if (isVisited.get(v) == false) {
                                    queue.add(adjacent);
                                    isVisited.set(adjacent, true);
                                    res.add(adjacent);
                                }
                            }
                    }

               // }
            }
        }

        return res;
    }

    public static void main(String[] args) {
       // List<ArrayList<Integer>> graph=createGraph();
        List<List<Integer>> g=createPreDefinedGraph();
        printGraph(g);
        List<Integer> traversal = bfs(g,1);
        System.out.print(traversal);
    }

}
