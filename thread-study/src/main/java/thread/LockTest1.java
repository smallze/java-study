package thread;

import blockingqueue.Consumer;

import java.math.BigDecimal;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zzs
 * @date 2022/3/24 22:49
 */
public class LockTest1 {

    public static void main(String[] args) {
        Account account = new Account(new BigDecimal(0));

        User user1 = new User(account);
        User user2 = new User(account);

        user1.setName("张三");
        user2.setName("李四");
        user1.start();
        user2.start();
    }

}

class Account {

    private BigDecimal balance;

    public Account(BigDecimal balance) {
        this.balance = balance;
    }

    private ReentrantLock lock = new ReentrantLock();

    //    public synchronized  void add(BigDecimal amt) {
    public void add(BigDecimal amt) {
//        synchronized (Account.class){
        lock.lock();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = balance.add(amt);
        lock.unlock();
        System.out.println(Thread.currentThread().getName() + "存钱，当前余额" + balance);
    }
}

class User extends Thread {

    private Account account;

    public User(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.add(new BigDecimal(1000));
        }
    }

}
