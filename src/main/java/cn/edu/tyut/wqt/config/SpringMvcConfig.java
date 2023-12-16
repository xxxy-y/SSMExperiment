package cn.edu.tyut.wqt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author 羊羊
 * @ClassName SpringMvcConfig
 * @SubmitTime 周六
 * @DATE 2023/12/16
 * @Time 22:29
 * @Package_Name cn.edu.tyut.wqt.config
 */
@Configuration
@ComponentScans({
        @ComponentScan("cn.edu.tyut.wqt.controller")
})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {

}
