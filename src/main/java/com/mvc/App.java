package com.mvc;

import com.mvc.config.SpringMvcConfig;
import com.mvc.controller.User2Controller;
import com.mvc.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMvcConfig.class);
        // ctx.register(SpringMvcConfig.class); 上面加了参数就不需要这行了
        System.out.println(ctx.getBean(UserController.class));
    }
}
