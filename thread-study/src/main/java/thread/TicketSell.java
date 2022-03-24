package thread;

public class TicketSell implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) { // 唯一的TicketSell对象
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "剩余票数:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }
    }
}
