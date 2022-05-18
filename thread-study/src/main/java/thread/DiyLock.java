package thread;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author zzs
 * @date 2022/3/31 18:51
 */
public class DiyLock extends AbstractQueuedSynchronizer{

    @Override
    public int tryAcquireShared(int arg){
        return 0;
    }
}
