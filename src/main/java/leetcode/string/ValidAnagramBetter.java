package leetcode.string;

public class ValidAnagramBetter {
    public static void main(String[] args) {
        String s="ac";
        String t="bb";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram1(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }

    public static boolean isAnagram2(String s, String t){
      int[] freq = new int[26];
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          freq[c-'a']++;
      }

        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            freq[c-'a']--;
        }

        for (int i:freq){
            if(i!=0) return false;
        }
        return true;
    }

    public static boolean isAnagram(String s, String t){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)-'a']++;

        for(int i=0;i<t.length();i++)
            freq[t.charAt(i)-'a']--;

        for (int i:freq){
            if(i!=0) return false;
        }
        return true;
    }
}
