package com.rcm.sistemas.springcacheredis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CacheService {

    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private EmpresaService empresaService;

    public void evictAllCacheValues(String cacheName) {
        Objects.requireNonNull(cacheManager.getCache(cacheName)).clear();
    }

//    @CachePut(value = "empresas", unless = "#result.size() <= 10000")
//    public List<Empresa> atualizarCacheEmpresas() {
//        return empresaService.listAll();
//    }
}
