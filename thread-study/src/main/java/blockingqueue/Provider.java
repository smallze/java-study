package blockingqueue;

public class Provider implements Runnable {

    private final MessageQueue queue;

    public Provider(MessageQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        int index = 0;
        while (true) {
            Message message = new Message(index++ + "", System.currentTimeMillis() + "_" + Thread.currentThread().getName());
            System.out.println("生产消息" + message.toString());
            queue.put(message);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}