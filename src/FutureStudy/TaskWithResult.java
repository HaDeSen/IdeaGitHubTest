package FutureStudy;

import java.util.concurrent.Callable;

class TaskWithResult implements Callable<String> {
    private static int num;
    private int id;
    public TaskWithResult() {
        id = num++;
        System.out.println("线程#"+id+"开始初始化");
    }
    @Override
    public String call() throws Exception {
        for(int i=0;i<3;i++){
            System.out.println("call ing...");
        }
        System.out.println("线程#"+id+"即将结束");
        return "Results of Task: "+id;
    }

}
