package tree.bst;

public class ReverseString {

    public static String reverse(String s){
        if(s.length() ==1){
            return s;
        }
        String temp =s.substring(0,1);
        String ans=reverse(s.substring(1,s.length()));
        return ans=ans+temp;
    }

    public static void main(String[] args) {
        String s="Hello";
        System.out.println(reverse(s));
    }
}
