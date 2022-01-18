package blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MessageQueue {

    public final BlockingQueue<Message> queue;

    public MessageQueue(int size) {
        this.queue = new ArrayBlockingQueue<Message>(size);
    }

    public void put(Message message) {
        this.queue.offer(message);
    }

    public Message get() {
        Message message = null;
        try {
            message = this.queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return message;
    }
}