package com.rcm.sistemas.springcacheredis.repository;

import com.rcm.sistemas.springcacheredis.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
