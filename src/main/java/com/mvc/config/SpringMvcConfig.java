package com.mvc.config;

import com.mvc.controller.UserController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.mvc")
        // , excludeFilters = @ComponentScan.Filter(
        //         type = FilterType.CUSTOM,
        //         classes = CustomControllerFilter.class
        // )
// )
@EnableWebMvc
public class SpringMvcConfig {
}
