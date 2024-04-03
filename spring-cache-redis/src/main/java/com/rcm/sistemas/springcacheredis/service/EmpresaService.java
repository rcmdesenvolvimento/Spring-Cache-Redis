package com.rcm.sistemas.springcacheredis.service;

import com.rcm.sistemas.springcacheredis.entity.Empresa;
import com.rcm.sistemas.springcacheredis.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Cacheable("empresas")
    public List<Empresa> listAll(){
        return this.empresaRepository.findAll();
    }
}
