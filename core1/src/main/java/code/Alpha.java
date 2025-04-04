package code;

import org.springframework.stereotype.Component;

@Component
public class Alpha {
    public Alpha(){
        System.out.println("Alpha is created");
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

}
