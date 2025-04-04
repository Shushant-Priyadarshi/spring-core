package shush.core.springBeanLifeCycle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetingService {
    
    @Autowired
    private LocalTime time;
    
    static {
        System.out.println("Static Block of greeting");
    }

    {
        System.out.println("Non static block of Greetings");
    }

    public GreetingService(){
        System.out.println("Constructor of Greeting Service");
    }

    public String greet(){
        int hour = time.getHour();
        if(hour < 12){
            return "Good Morning!";
        } else if (hour < 16) {
            return "Good Afternoon";
        }else if(hour < 20 ){
            return "Good Evening!";
        }else{
            return "Good Night!";
        }

    }
}
