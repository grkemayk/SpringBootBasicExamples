package com;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableScheduling
public class SchedulerConfiguration {
    private static final int DEFAULTPOOL = 5;
    private static final int MAXPOOL = 30;
    private static final int SURVIVETIME = 10;
    private static final int BUFFERSIZE = 30;
    private static final String THREADNAMEPREFIX = "asyncSchedule-";
    @Bean("asyncScheduleBean")
    public ThreadPoolTaskExecutor getAsynsScheduled()
    {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(DEFAULTPOOL);
        executor.setMaxPoolSize(MAXPOOL);
        executor.setQueueCapacity(SURVIVETIME);
        executor.setKeepAliveSeconds(BUFFERSIZE);
        executor.setThreadNamePrefix(THREADNAMEPREFIX);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
    @Scheduled(cron="*/10 * * * * *" )//Every 10 seconds.
    @Async("asyncScheduleBean")
    public void reflesh(){
        System.out.println(System.currentTimeMillis());
    }
}
