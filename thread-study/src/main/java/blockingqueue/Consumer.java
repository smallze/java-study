package blockingqueue;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable {
    private final MessageQueue queue;

    public Consumer(MessageQueue queue) {
        this.queue = queue;
        this.messageList = new ArrayList<>();
    }

    private List<Message> messageList;

    @Override
    public void run() {
        while (true) {
            Message message = this.queue.get();
//            System.out.println("消费者消费" + message.toString());
            messageList.add(message);
            if (messageList.size() >= 10) {
                System.out.println("批量插入中...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                messageList.clear();
            }
        }
    }
}