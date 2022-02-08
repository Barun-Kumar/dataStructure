package reverse;

public class ReverseInteger {

    public static void main(String[] args) {
        int number=123456789;
        System.out.println(reverseInteger(number));
    }

    public static int reverseInteger(int number){
        int rev=0;
        while(number!=0){
            int remainder = number%10;
            rev =rev*10+remainder;
            number=number/10;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }
        }
        return rev;
    }
}
