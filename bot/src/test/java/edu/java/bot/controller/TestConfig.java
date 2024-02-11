package edu.java.bot.controller;

import com.pengrad.telegrambot.TelegramBot;
import edu.java.bot.service.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.mockito.Mockito.mock;

@Configuration
public class TestConfig {

    @Bean
    public TelegramBot telegramBot() {
        return mock(TelegramBot.class);
    }

    @Bean
    public NotificationService notificationService() {
        return mock(NotificationService.class);
    }

}
