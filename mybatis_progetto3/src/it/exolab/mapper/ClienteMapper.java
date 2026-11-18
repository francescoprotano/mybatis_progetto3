package it.exolab.mapper;

import java.util.List;

import it.exolab.model.Cliente;

public interface ClienteMapper {
	
	void insert(Cliente model);
	List<Cliente> findAll();

}
