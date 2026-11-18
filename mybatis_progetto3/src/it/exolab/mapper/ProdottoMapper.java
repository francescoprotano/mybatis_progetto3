package it.exolab.mapper;

import java.util.List;

import it.exolab.model.Prodotto;

public interface ProdottoMapper {
	
	void insert(Prodotto model);
	void update(Prodotto model);
	void updateQuantita(Prodotto model);
	void delete(Long id);
	List<Prodotto> findAll();
	Prodotto find(Long id);

}
