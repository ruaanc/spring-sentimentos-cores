package com.sentimentos.mc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentimentos.mc.domain.Cor;


@Repository
public interface CorRepository extends JpaRepository<Cor, Integer>{

}
