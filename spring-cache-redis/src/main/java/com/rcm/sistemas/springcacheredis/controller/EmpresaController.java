package com.rcm.sistemas.springcacheredis.controller;

import com.rcm.sistemas.springcacheredis.entity.Empresa;
import com.rcm.sistemas.springcacheredis.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping()
    public List<Empresa> listAll() {
        System.out.println("********* Selecionando Registros ********** "+LocalDateTime.now());
        return this.empresaService.listAll();
    }

}
