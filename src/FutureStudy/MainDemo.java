package FutureStudy;

import java.util.ArrayList;
import java.util.concurrent.*;

public class MainDemo {

    public static void main(String[] args) {
        ExecutorService exc = Executors.newCachedThreadPool();
//        ExecutorService exc = new ThreadPoolExecutor(3,3,);
        ArrayList<Future<String>> res = new ArrayList<Future<String>>();
        res.add(exc.submit(new TaskWithResult()));
        for(Future<String > r: res){
            try {
                System.out.println(r.get());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }finally {
                exc.shutdown();
            }
        }

    }
}
