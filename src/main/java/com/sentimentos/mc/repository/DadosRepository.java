package com.sentimentos.mc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentimentos.mc.domain.Dados;

@Repository
public interface DadosRepository extends JpaRepository<Dados, Integer>{

}
