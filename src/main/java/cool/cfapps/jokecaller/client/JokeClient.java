package cool.cfapps.jokecaller.client;

import cool.cfapps.jokecaller.dto.JokeResponseDto;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Mono;

public interface JokeClient {
    @GetExchange("/")
    Mono<JokeResponseDto> random();

}
