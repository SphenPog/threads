public class ThreadDemo implements Runnable {

    private Thread t;
    private String threadName;

    ThreadDemo (String name){
        threadName = name;
    }

    public void run(){
        System.out.println(LazyInitializedSingleton.getInstance().hashCode());
    }

    public void start(){
        System.err.println(threadName);
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
