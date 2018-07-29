/***
 * @author skyer
 */
public class ThreadStudy extends Thread{


    @Override
    public void run(){

    }



    public static void main(String[] args) {
        ThreadStudy t1=new ThreadStudy();
        t1.suspend();
        t1.resume();
        Thread.yield();


    }
}