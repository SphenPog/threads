import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ThreadDemo> list = new ArrayList<>();

        for (int i = 0; i <50; i++){
             list.add(new ThreadDemo("thread-" + i));
        }

        for (ThreadDemo t: list) {
            t.start();
        }

    }

}
