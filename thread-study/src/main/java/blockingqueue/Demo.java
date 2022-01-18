package blockingqueue;

import javax.xml.namespace.QName;

public class Demo {

    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue(100);

        Provider provider = new Provider(queue);
        Thread thread1 = new Thread(provider);
        thread1.start();

        Consumer consumer = new Consumer(queue);
        Thread thread2 = new Thread(consumer);
        thread2.start();
    }
}