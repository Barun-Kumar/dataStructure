package thread.memoryModel;

public class ShareObject {
    public static void main(String[] args) {
        sharedRunnable();
        //separateRunnable();
    }

    public static void sharedRunnable(){
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
    }
    public static void separateRunnable(){
        MyRunnable r1 = new MyRunnable();
        MyRunnable r2 = new MyRunnable();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }

}
