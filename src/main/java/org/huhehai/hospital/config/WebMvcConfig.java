package org.huhehai.hospital.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 修改为匹配所有路径，实现全局跨域配置
                .allowedOrigins("http://10.3.83.194:8080")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT") // 补充更多常见的HTTP方法，可根据实际情况调整
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);
    }
}