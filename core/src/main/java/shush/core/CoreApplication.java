package shush.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import shush.core.springBeanLifeCycle.service.GreetingService;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(CoreApplication.class, args);
        GreetingService greet = container.getBean(GreetingService.class);
        System.out.println(greet.greet());
    }

}
