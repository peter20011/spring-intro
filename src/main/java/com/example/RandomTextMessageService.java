package com.example;

import org.springframework.context.annotation.Configuration;

import java.util.Random;
@Configuration
public class RandomTextMessageService implements MessageService{

    String[] news= {"news1","news2","news3","news4","news5","news6","news7","news8","news9","news10"};
    @Override
    public String getMessage() {
        int randomix= new Random().nextInt(news.length);
        return news[randomix];
    }
}

