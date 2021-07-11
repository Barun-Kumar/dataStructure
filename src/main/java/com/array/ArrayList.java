package com.array;

public class ArrayList implements List{

    private int[] array;
    private static final int INITIAL_SIZE =16;
    private static int listSize=INITIAL_SIZE;
    private static int currentIndex=-1;
    private static final float loadFactor=0.75f;

    public ArrayList(){
        array=new int[INITIAL_SIZE];
    }
    @Override
    public void add(int value) {
        if(currentIndex< listSize-1) {
            array[++currentIndex] = value;
        }
        else{
            try {
                this.array=increaseArray();
                array[++currentIndex]=value;
                listSize=array.length-1;
            }catch (Exception e){
                System.out.println("Error while increasing the size of the array");
            }
        }
    }

    @Override
    public void add(int position, int value) {
       // if(position)
    }

    @Override
    public int get(int index) {
        int value=-1;
        if(index>-1 && index<=currentIndex){
            value=this.array[index];
        }
        return value;
    }

    @Override
    public int remove(int value) {
        int index =search(value);
        int deletedElement=-1;
        if(index!=-1){
            deletedElement=this.array[index];
            shift(index,this.array.length);
            currentIndex--;
        }
        return deletedElement;
    }

    @Override
    public boolean isEmpty() {
        return currentIndex == -1;
    }

    @Override
    public int size() {
        return currentIndex;
    }

    private int[] increaseArray() throws Exception {
        int loadFactorInt =  (int)(10*(loadFactor));
        int []temp=null;
        if(currentIndex>=loadFactorInt){
           temp= new int[listSize +(loadFactorInt*2)];
          this.array= copyArray(array,temp);
        }
        return this.array;
    }

    /**
     *
     * @param oldArray
     * @param newArray
     * @throws Exception
     */
    private int[] copyArray(int[] oldArray, int []newArray) throws Exception {
        if(oldArray.length==0){
            throw new Exception("There is no element to copy");
        }else if(oldArray.length<=newArray.length){
            for(int i=0;i<oldArray.length;i++){
                newArray[i]=oldArray[i];
            }
        }
        return newArray;
    }

    /**
     * It searches for the value and returns the index
     * @param value to be be searched
     * @return values's index which is found else return -1
     */
    public int search(int value){
        int index=-1;
        for(int i=0;i<this.array.length;i++){
            if(value==this.array[i]){
                index= i;
            }
        }
        return index;
    }

    /**
     * shifts array from start to end
     * @param start point to start
     * @param end point to end
     */
    private void shift(int start, int end){
        for (int i=start;i<end -1;i++){
            this.array[i]=this.array[i+1];
        }
    }
}
