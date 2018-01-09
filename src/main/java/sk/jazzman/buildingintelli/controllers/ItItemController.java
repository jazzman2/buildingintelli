package sk.jazzman.buildingintelli.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import sk.jazzman.buildingintelli.domain.ItItem;

@RestController()
public class ItItemController {

    @GetMapping("/get")
    public Mono<ServerResponse> findAll() {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(Mono.just(new ItItem(Long.valueOf(1), "TestIt")), ItItem.class);
    }

    @GetMapping("geti")
    public Mono<ItItem> get(){
        return Mono.just(new ItItem(Long.valueOf(1), "TestIt"));
    }
}
