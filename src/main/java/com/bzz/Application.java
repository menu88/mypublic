package com.bzz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@Controller
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
    	
    	
    	
    	
        return "Hello World! \t 浣犲ソ澶х唺,鍢垮樋鍢�;
    }

}
