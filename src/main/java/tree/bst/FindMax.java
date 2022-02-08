package tree.bst;

import com.array.List;

import java.util.Arrays;

public class FindMax {

    public static void main(String[] args) {

    int[] stock= {5,2,7,10,1};

    int minIndex=0;
    int maxIndex=0;
    int max=0;
    for(int i=0;i<stock.length-1;i++){
        for(int j=i+1;j<stock.length;j++){
            int temp = stock[j]-stock[i];
            if(temp>max){
                max=temp;
                minIndex =i;
                maxIndex=j;
            }
        }
    }

        System.out.println(max);
        System.out.println(minIndex);
        System.out.println(maxIndex);




    }




}
