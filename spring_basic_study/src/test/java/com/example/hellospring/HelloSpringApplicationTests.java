package com.example.hellospring;

import com.example.hellospring.dto.User2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("------------");

        var objectMapper = new ObjectMapper();

        var user = new User2("andrew", 35, "010-1111-2222");

        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        var objectUser = objectMapper.readValue(text, User2.class);
        System.out.println(objectUser);

    }

}
