package it.exolab.mapper;

import java.util.List;

import it.exolab.model.Ordine;

public interface OrdineMapper {

	void insert(Ordine model);
	List<Ordine> findAll();
	List<Ordine> findAllJoinProdottoECliente();
	
	void delete(Long id);

}
