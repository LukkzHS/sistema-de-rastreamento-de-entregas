package br.edu.iftm.rastreamento.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.rastreamento.model.Rastreamento;
@Repository
public interface RastreamentoRepository extends CrudRepository<Rastreamento, Long> {
	
}
