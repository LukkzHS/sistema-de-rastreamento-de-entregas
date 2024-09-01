package br.edu.iftm.rastreamento.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.rastreamento.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
	
}
