package Test3;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        String s1= "ABCD";
        String s2 = "CDAB";
       // testRotation(s1,s2);
        String s3 = s1+s2;
        if(s3.contains(s2)){
            System.out.println(true);
        }
    }

    // abcd  dabc
    public static boolean testRotation(String s1, String s2){
        char[] c = s1.toCharArray();
        List<String> list;
        boolean isTrue=false;
        for(int i=c.length-1;i>=0;i--){
            list = new ArrayList<>();
            list.add(c[i]+"");

            for(int j=0;j< c.length-2;j++) {
                list.add(c[j] + "");
            }
            char last =c[c.length-1];
            //c[last]= c[0];
            c[0]=last;
            StringBuilder newString = new StringBuilder();
            for(String temp: list){
                newString.append(temp);
            }
            System.out.println(newString);
            if(newString.toString().equalsIgnoreCase(s2)){
                isTrue=true;
                break;
            }
        }
        return isTrue;
    }

}
