package pers.hong.project.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * reddison 分布式锁
 * @author liwenqiang
 */
@Configuration
public class RedissonConfiguration {


    @Bean
    public RedissonClient getRedison(){
        // 1. Create config object
//        Config config = new Config();
//        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        // Sync and Async API
        RedissonClient redisson = Redisson.create();
        return  redisson;
    }
}
