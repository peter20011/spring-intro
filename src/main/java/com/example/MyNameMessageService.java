package com.example;

import org.springframework.context.annotation.Configuration;

@Configuration("messageService")
public class MyNameMessageService implements MessageService {
    @Override
    public String getMessage(){
        return "Piotr Warcholek";
    }
}
