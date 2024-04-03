package com.rcm.sistemas.springcacheredis.agendador;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class CacheAgendado {

    @Scheduled(fixedDelay = 5, timeUnit = TimeUnit.MINUTES)
    @CacheEvict("empresas")
    public void limparCache(){
        System.out.println("********* Limpando Cache ********** "+LocalDateTime.now());
    }
}
