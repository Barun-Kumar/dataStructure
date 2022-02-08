package graphAlgorithm;

import java.util.*;

public class Dfs {

    public static void main(String[] args) {
        Map<String, List<String>> graph= new HashMap<String,List<String>>();
        graph.put("a", Arrays.asList("c","b"));
        graph.put("b", Arrays.asList("d"));
        graph.put("c", Arrays.asList("e"));
        graph.put("d", Arrays.asList("f"));
        graph.put("e", Arrays.asList());
        graph.put("f", Arrays.asList());
        List<String>result=dfs(graph,"a");
        System.out.println(result);
        List<String> res = new ArrayList<String>();
        dfsRecursive(graph,"a",res);
        System.out.println(res);
    }

    /**
     * Iterative solution DFS graph traversal
     * @param graph
     * @param source
     * @return
     */
    public static List<String> dfs(Map<String,List<String>> graph,String source){
        Stack<String> stack = new Stack<String>();
        List<String> result= new ArrayList<>();
        stack.push(source);
        while(!stack.isEmpty()){
            String node = stack.pop();
           result.add(node);
            if(graph.keySet().contains(node)){
                List<String> neighbours= graph.get(node);
                for(String s: neighbours){
                    stack.push(s);
                }
            }
        }
        return result;
    }

    public static void dfsRecursive(Map<String,List<String>> graph,String source,List<String> result){
        result.add(source);
        List<String> neighbours = graph.get(source);
        for(String node: neighbours){
            dfsRecursive(graph,node,result);
        }
    }

}
