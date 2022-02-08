package sorting;

import utils.ArrayUtils;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateRandomArray(10,1,100);
        ArrayUtils.printArray(arr);
        mergeSort(arr);
        ArrayUtils.printArray(arr);
    }

    public static void mergeSort(int[] arr){
        if(arr.length==1){
            return;
        }else{
            int mid=arr.length/2;
            int[]A= new int[mid];
            int[]B = new int[arr.length-mid];
            for (int i=0;i<mid;i++){
                A[i]=arr[i];
            }
            for (int i=mid;i<arr.length;i++){
                B[i-mid]=arr[i];
            }
            mergeSort(A);
            mergeSort(B);
            merge(A,B,arr);
        }
    }

    public static void merge(int[]A, int[]B, int[]C){
        int i=0,j=0,k=0;
        while (i<A.length && j<B.length){
            if(A[i]<B[j]){
                C[k]=A[i];
                i++;
                k++;
            }else {
                C[k]=B[j];
                k++;
                j++;
            }
        }

        while (i<A.length){
            C[k]=A[i];
            k++;i++;
        }

        while(j<B.length){
            C[k]=B[j];
            k++;j++;
        }
    }
}
