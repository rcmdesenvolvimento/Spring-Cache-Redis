package com.rcm.sistemas.springcacheredis.controller;

import com.rcm.sistemas.springcacheredis.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @GetMapping("/teste")
    public String cache() {
        return "Cache";
    }

    @PostMapping
    public void clear(@RequestParam("cacheName") String cacheName) {
        System.out.println("Limpando Cache");
        cacheService.evictAllCacheValues(cacheName);
    }

//    @PutMapping
//    public void atualizar() {
//        cacheService.atualizarCacheEmpresas();
//    }
}
