package edu.java;

import edu.java.model.LinkModel;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class LinkUpdaterScheduler {
    @Scheduled(fixedDelayString = "#{@scheduler.interval.toMillis()}")
    public void update() {
        log.info("Произошло обновление");

    }
}

