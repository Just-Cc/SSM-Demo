package com.example.demo.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig {

    private final int corePoolSize = 10;

    private final int maxPoolSize = 200;

    private final int queueCapacity = 10;


    @Bean
    public Executor taskExecutor() {//返回一个线程池

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        executor.setCorePoolSize(corePoolSize);

        executor.setMaxPoolSize(maxPoolSize);

        executor.setQueueCapacity(queueCapacity);

        executor.initialize();

        return executor;

    }

}
