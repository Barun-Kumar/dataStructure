package thread.executerservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Prime Calculator");
        System.out.println("Enter the max range to find all prime in that range");
        Scanner scanner = new Scanner(System.in);
        Integer number= scanner.nextInt();
        System.out.println("Enter the block size");
        Integer blockToDivide=scanner.nextInt();
        Long startTime=System.currentTimeMillis();
        List<Integer> ranges=blockCalculator(number,blockToDivide);
        Integer size=ranges.size();
        System.out.println(ranges);
        System.out.println("Total number of blocks :"+size +"Creating number of thread "+size);
        List<Integer> listOfPrimeNumbers= new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(size);
        int start=2;
        List<Future> futures= new ArrayList<>();
        for (int i=0;i<ranges.size();i++){
            PrimeCalculator task=new PrimeCalculator(start,ranges.get(i));
            start=ranges.get(i)+1;
            Future future=service.submit(task);
            futures.add(future);
            //listOfPrimeNumbers.addAll((Collection<? extends Integer>) futures.get());
            //System.out.println("Result from future :"+futures.get());
        }
        for (Future future: futures){
            listOfPrimeNumbers.addAll((Collection<? extends Integer>) future.get());
        }
        service.shutdown();
        System.out.println(listOfPrimeNumbers);
        long endTime=System.currentTimeMillis();
        System.out.println("Time taken to complete the process :"+(endTime-startTime));

    }

    public static List<Integer> blockCalculator(Integer number, Integer blockToDivide){
        List<Integer> ranges = new ArrayList<>();
        if(number<=blockToDivide){
            ranges.add(number);
        }else{
            Integer temp=number;
            while(temp>0){
                temp=temp-blockToDivide;
                ranges.add(number-temp);
                if(temp<blockToDivide && temp>0){
                    ranges.add(temp);
                    temp=0;
                }
            }
        }
        return ranges;
    }
}


