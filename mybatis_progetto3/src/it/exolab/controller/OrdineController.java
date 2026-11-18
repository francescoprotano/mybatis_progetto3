package it.exolab.controller;

import it.exolab.dao.OrdineDAO;
import it.exolab.model.Ordine;
import it.exolab.view.OrdineView;

public class OrdineController {
	public void insert() {
		//1) Creo il modello
		//2) Creo la view
		//3) passo il modello alla view
		//4) richiamo il crud
		Ordine model = new Ordine();
		OrdineView view = new OrdineView();
		view.insert(model);
		OrdineDAO.getInstance().insert(model);
		
	}
	public void delete() {
		//1) Creo il modello
		//2) Creo la view
		//3) passo il modello alla view
		//4) richiamo il crud
		OrdineView view = new OrdineView();
		Long id = view.getId();
		OrdineDAO.getInstance().delete(id);
		
	}
}
