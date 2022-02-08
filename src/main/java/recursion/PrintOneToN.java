package recursion;

public class PrintOneToN {
    public static void main(String[] args) {
        printOneToN(10);
        System.out.println("================");
        printNTOne(10);

    }

    /**
     * Print One to N
     * @param n
     */
    public static void printOneToN(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
    }


    /**
     * Print N to 1
     * @param n
     */
    public static void printNTOne(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNTOne(n-1);
    }

}
