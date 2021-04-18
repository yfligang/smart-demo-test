package demo11;
//买火车票的例子
public class TestThread4 implements Runnable {
    //火车票票数
    private int ticketNums = 10;

    //重写run方法
    @Override
    public void run() {
        while(true){
            if (ticketNums <= 0){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //打印出谁拿到了第N张票 谁用的是 Thread.currentThread().getName
            System.out.println(Thread.currentThread().getName() + "-->拿到了第 " + ticketNums-- + " 张票");

        }
    }

    public static void main(String[] args){
        TestThread4 ticket = new TestThread4();

        //目前有三个线程在抢10张票
        new Thread(ticket,"小明").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛党").start();
    }
}
