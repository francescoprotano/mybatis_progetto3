package it.exolab.controller;

import java.util.List;

import it.exolab.dao.ProdottoDAO;
import it.exolab.model.Prodotto;
import it.exolab.view.ProdottoView;

public class ProdottoController {
	
	public void insert() {
		//1) Creo il modello
		//2) Creo la view
		//3) passo il modello alla view
		//4) richiamo il crud
		Prodotto model = new Prodotto();
		ProdottoView view = new ProdottoView();
		view.insert(model);
		ProdottoDAO.getInstance().insert(model);
		
	}
	public void findAll() {
		//1) Creo il modello
		//2) Creo la view
		//3) passo il modello alla view
		//4) richiamo il crud
		ProdottoView view = new ProdottoView();
		List<Prodotto> models =  ProdottoDAO.getInstance().findAll();
		view.print(models);
		
		
	}

}
