package pers.hong.project.zookeeper.lock;

import lombok.extern.slf4j.Slf4j;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

@Slf4j
public class Tests {

    public static void main(String[] args) {
        //创建zookeeper的客户端

        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);

        CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", retryPolicy);

        client.start();

        //创建分布式锁, 锁空间的根节点路径为/curator/lock
        InterProcessMutex mutex = new InterProcessMutex(client, "/awesome/lock");
        try {
            mutex.acquire();
            log.info("zookeeper 加锁成功  线程休眠");
            Thread.sleep(10000000);



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                mutex.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
