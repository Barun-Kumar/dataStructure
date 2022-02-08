package thread.threadLocal;

import java.util.*;

public class FindDuplicate {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,2,5,6,7,5,8);
        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer n: list){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        List<Integer> duplicate =new ArrayList<>();
        List<Integer> unique = new ArrayList<>();
        Iterator<Integer> itr = map.keySet().iterator();
        while(itr.hasNext()){
            Integer k= itr.next();
            if(map.get(k)>1){
                duplicate.add(k);
            }else {
                unique.add(k);
            }
        }

        System.out.println(duplicate);
        System.out.println(unique);

    }
}
