package thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zzs
 * @date 2022/3/23 23:21
 */
class Window implements Runnable {

    private int ticket = 100;

    private ReentrantLock reentrantLock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            reentrantLock.lock();
            try {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "当前剩余票数" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                reentrantLock.unlock();
            }
        }
    }
}


public class Lock1 {

    public static void main(String[] args) {
        Window window = new Window();

        Thread thread1 = new Thread(window);
        Thread thread2 = new Thread(window);
        Thread thread3 = new Thread(window);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
