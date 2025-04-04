package shush.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class TimeConfig {

    @Bean
    public LocalTime createTimeInstance(){
        LocalTime now = LocalTime.now();
        return now;
    }
}
