package sorting;

import utils.ArrayUtils;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr=ArrayUtils.generateRandomArray(10,0,50);
        ArrayUtils.printArray(arr);
        selectionSort(arr);
        ArrayUtils.printArray(arr);
    }

    public static void selectionSort(int[] arr){
        if(arr.length==0){
            return;
        }else{
            for (int i=0;i<arr.length;i++){
                int min=i;
                for(int j=i;j<arr.length;j++){
                    if(arr[j]<arr[min]){
                        min=j;
                    }
                }
                int t= arr[i];
                arr[i]=arr[min];
                arr[min]=t;
            }
        }
    }


}
