package edu.java.bot.configuration;

import edu.java.bot.service.commands.CommandService;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandConfig {

    @Autowired
    private List<CommandService> commandServices;

    @Bean
    @Qualifier("commandMap")
    Map<String, CommandService> commandMap() {
        return commandServices.stream().collect(Collectors.toMap(CommandService::getName, command -> command));
    }

}
