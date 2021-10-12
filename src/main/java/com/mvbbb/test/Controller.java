package com.mvbbb.test;

//import com.mvbbb.rx.rest.annotation.RequestMapping;
//import com.mvbbb.rx.rest.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: mvbbb
 */
@RestController
public class Controller {
    @RequestMapping("/test")
    public String get(){
//        try {
//            Thread.sleep(300);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "1111";
    }
}
