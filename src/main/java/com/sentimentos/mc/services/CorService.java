package com.sentimentos.mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sentimentos.mc.domain.Cor;
import com.sentimentos.mc.repository.CorRepository;
import com.sentimentos.mc.services.exception.ObjectNotFoundException;

@Service
public class CorService {
	
	@Autowired
	private CorRepository repo;
	
	public Cor find(Integer id) {
		Optional<Cor> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", Tipo: " + Cor.class.getName()));
	}
	
	public Cor insert(Cor obj) {
		obj.setId(null);
		return repo.save(obj);
	}

}
