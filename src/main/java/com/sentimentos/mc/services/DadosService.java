package com.sentimentos.mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.sentimentos.mc.domain.Dados;
import com.sentimentos.mc.repository.DadosRepository;
import com.sentimentos.mc.services.exception.ObjectNotFoundException;

public class DadosService {
	
	@Autowired
	private DadosRepository repo;
	
	public Dados find(Integer id) {
		Optional<Dados> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", Tipo: " + Dados.class.getName()));
	}
	
	public Dados insert(Dados obj) {
		obj.setId(null);
		return repo.save(obj);
	}

}
