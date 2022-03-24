package thread;

/**
 * @author zzs
 * @date 2022/3/23 22:56
 */
class A {
    public synchronized void consumeB(B b){
        System.out.println("当前线程名称："+Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.getIn();
    }

    public synchronized void getIn() {
        System.out.println("进入B方法内部");
    }
}

class B {

    public synchronized void consumeA(A a){
        System.out.println("当前线程名称："+Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.getIn();
    }

    public synchronized void getIn() {
        System.out.println("进入B方法内部");
    }
}
public class DeadLockTest2 {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        new Thread(new Runnable() {
            @Override
            public void run() {
                a.consumeB(b);
            }
        }).start();
        b.consumeA(a);
    }
}
