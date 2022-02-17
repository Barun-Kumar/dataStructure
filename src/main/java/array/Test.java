package array;

public class Test {
    public static void main(String[] args) {
      /*  ArrayList<String> list= new ArrayList<>();
        String s ="VARUN";
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i)+"");
        }

        list.print();
        System.out.println(list.size());

        list.remove("U");
        list.print();
        System.out.println(list.size());

        list.remove("V");
        System.out.println(list.size());
        list.print();*/


        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<12;i++){
            list.add(i);
        }
        list.print();

        list.remove(5);
        list.print();
    }
}
