package graphAlgorithm;

import java.util.*;

public class Bfs {
    public static void main(String[] args) {
        Map<String, List<String>> graph= new HashMap<String,List<String>>();
        graph.put("a", Arrays.asList("c","b"));
        graph.put("b", Arrays.asList("d"));
        graph.put("c", Arrays.asList("e"));
        graph.put("d", Arrays.asList("f"));
        graph.put("e", Arrays.asList());
        graph.put("f", Arrays.asList());
        List<String>result=bfs(graph,"a");
        System.out.println(result);
    }

    public static List<String> bfs(Map<String,List<String>> graph, String source){
        Queue<String> queue = new LinkedList<>();
        List<String> result= new ArrayList<>();
        queue.add(source);
        while (!queue.isEmpty()){
            String node= queue.poll();
            result.add(node);
            List<String> neighbours = graph.get(node);
            for(String s:neighbours){
                queue.add(s);
            }
        }
        return result;

    }
}
