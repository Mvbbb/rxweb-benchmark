package com.mvbbb.test;

//import com.mvbbb.rx.rest.server.RxServer;
//import com.mvbbb.rx.rest.server.RxServerBuilder;

import com.mvbbb.rx.springboot.EnableRx;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: mvbbbc
 */
@SpringBootApplication
@EnableRx
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
