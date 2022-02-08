package leetcode.string;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome("0P"));
    }


    public static boolean isCharOrNumber(char ch){
        if(('A'<= ch && ch <= 'Z') || ('a'<=ch && ch <='z') || ('0'<=ch && ch <='9')) {
            return true;
        }else{
            return false;
        }
    }

    public static char toLowerCase(char ch){
        if('A'<=ch && ch <='Z')
            return (char)(ch-'A' +'a');
        else
            return ch;
    }




    public static boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left=0;
        int right=arr.length-1;
        char first;
        char last;
        while(left<right){
            first=arr[left];
            last= arr[right];
            if(!isCharOrNumber(first)) {
                left++;
            }
            if(!isCharOrNumber(last)) {
                right--;
            }
            else if(toLowerCase(first)!=toLowerCase(last)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }







    public static boolean isPalindrome_Worst(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        s=s.toLowerCase();
        System.out.println(s);
        StringBuffer buffer = new StringBuffer(s);
        if(buffer.reverse().toString().equalsIgnoreCase(s)){
            return true;
        }else{
            return false;
        }

    }


}


