package edu.java.bot.configuration.retry;

import java.time.Duration;
import java.util.List;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import reactor.util.retry.Retry;
import static edu.java.bot.configuration.retry.RetryUtils.createFilterWithCodes;

@Log4j2
@UtilityClass
public class ExponentRetry {

    public static Retry exponentRetry(List<Integer> statusCodes, Integer attempts, Duration backoff) {
        return Retry.backoff(
            attempts,
            backoff
        ).filter(createFilterWithCodes(statusCodes));
    }
}