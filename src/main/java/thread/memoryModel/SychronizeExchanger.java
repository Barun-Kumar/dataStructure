package thread.memoryModel;

public class SychronizeExchanger {
    public static void main(String[] args) {
        Token obj = new Token();
        Runnable setter = (() -> {

                for (int i = 0; i < 5; i++) {
                  //  synchronized (obj) {
                    while(obj.isAvailable()){
                        continue;
                    }
                    if(!obj.isAvailable()) {
                        System.out.println("Setting 1");
                        obj.setToken(1);
                        obj.setAvailable(true);
                    }
                }
           // }
        });

        Runnable getter = (() -> {
                for (int i = 0; i < 5; i++) {
                  //  synchronized (obj) {
                    while(!obj.isAvailable()){
                        continue;
                    }
                    if(obj.isAvailable()) {
                        System.out.println("Getting 1");
                        int r = obj.getToken();
                        System.out.println(r);
                        r-=1;
                        obj.setAvailable(false);
                    }
                }
            //}
        });


        Thread t1 = new Thread(setter);
        Thread t2 = new Thread(getter);

        t2.start();
        t1.start();
    }


}

class Token{
    private int token =0;
    private volatile boolean isAvailable;

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

