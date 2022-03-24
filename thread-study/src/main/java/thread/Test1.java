package thread;

/**
 * @author zzs
 * @date 2022/3/20 23:32
 */
public class Test1 {
    public static void main(String[] args) {
        TicketSell ticketSell = new TicketSell();
        Thread thread1 = new Thread(ticketSell);
        Thread thread2 = new Thread(ticketSell);
        Thread thread3 = new Thread(ticketSell);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
