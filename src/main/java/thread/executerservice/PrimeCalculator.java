package thread.executerservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class PrimeCalculator implements Callable<List<Integer>> {

    private Integer startRange;
    private Integer endRange;

    public PrimeCalculator(int startRange, Integer endRange) {
        this.startRange=startRange;
        this.endRange=endRange;
    }

    public PrimeCalculator() {
    }

    @Override
    public List<Integer> call(){
        System.out.print(Thread.currentThread().getName() +" ->");
        System.out.println(startRange +" : "+endRange);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=startRange;i<=endRange;i++){
            if(this.calculatePrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean calculatePrime(Integer number){
        boolean isPrime=true;
        for(int i=2;i<=(number/2);i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
       // System.out.println(number +" is prime :"+isPrime);
        return isPrime;
    }


    public static void main(String[] args) {
        PrimeCalculator p = new PrimeCalculator();
        p.calculatePrime(4);
    }
}

