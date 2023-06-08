package cool.cfapps.jokecaller.client;

import cool.cfapps.jokecaller.dto.CategoryResponseDto;
import cool.cfapps.jokecaller.dto.LinkResponseDto;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Flux;

public interface LinkClient {
    @GetExchange("/api/v1/categories")
    Flux<CategoryResponseDto> categories();

    @GetExchange("/api/v1/links")
    Flux<LinkResponseDto> links();

}
