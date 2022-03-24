package thread;

/**
 * @author zzs
 * @date 2022/3/24 23:23
 */
public class LockTest2 {

    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
    }
}

class Number implements Runnable {

    private int num = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (num < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;

                    try {
                        // 线程阻塞
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}