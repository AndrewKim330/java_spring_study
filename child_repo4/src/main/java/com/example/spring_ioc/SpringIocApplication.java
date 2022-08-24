package com.example.spring_ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringIocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIocApplication.class, args);

        String url = "https://www.naver.com/it?page=10&size=20&name=spring-boot";

        ApplicationContext context = ApplicationContextProvider.getContext();

        Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
        Encoder encoder = new Encoder(base64Encoder);
        String result = encoder.encode(url);
        System.out.println(result);

        UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);
        encoder.setIEncoder(urlEncoder);
        result = encoder.encode(url);
        System.out.println(result);


        Encoder encoder2 = context.getBean("new_base64Encoder", Encoder.class);
        String result2 = encoder2.encode(url);
        System.out.println(result2);

        encoder2 = context.getBean("new_urlEncoder", Encoder.class);
        result2 = encoder2.encode(url);
        System.out.println(result2);
    }
}

@Configuration
class AppConfig {

    @Bean("new_base64Encoder")
    public Encoder encoder (Base64Encoder base64Encoder) {
        return new Encoder(base64Encoder);
    }

    @Bean("new_urlEncoder")
    public Encoder encoder (UrlEncoder urlEncoder) {
        return new Encoder(urlEncoder);
    }
}