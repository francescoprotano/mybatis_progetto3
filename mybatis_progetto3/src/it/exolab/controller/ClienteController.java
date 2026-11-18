package it.exolab.controller;

import java.util.List;

import it.exolab.dao.ClienteDAO;
import it.exolab.model.Cliente;
import it.exolab.view.ClienteView;

public class ClienteController {
	public void insert() {
		//1) Creo il modello
		//2) Creo la view
		//3) passo il modello alla view
		//4) richiamo il crud
		Cliente model = new Cliente();
		ClienteView view = new ClienteView();
		view.insert(model);
		ClienteDAO.getInstance().insert(model);
		
	}
	public void findAll() {
		//1) Creo il modello
		//2) Creo la view
		//3) passo il modello alla view
		//4) richiamo il crud
		ClienteView view = new ClienteView();
		List<Cliente> models =  ClienteDAO.getInstance().findAll();
		view.print(models);
		
		
	}
}
