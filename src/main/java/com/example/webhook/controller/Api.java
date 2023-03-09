package com.example.webhook.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Slf4j
@RequestMapping("/v1/webhook")
@RestController("Api")
@AllArgsConstructor
public class Api {

    @PostMapping
    public void any(@RequestBody Object object){
        log.info("----------------");
        log.info("Mensagem:");
        log.info(String.valueOf(object));
        log.info("----------------");
        System.out.println();
    }

}
