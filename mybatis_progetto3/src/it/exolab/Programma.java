package it.exolab;

import it.exolab.controller.ClienteController;
import it.exolab.controller.OrdineController;
import it.exolab.controller.ProdottoController;

public class Programma {

	public static void main(String[] args) {
		
		ProdottoController prodottoController  = new ProdottoController();
		ClienteController clienteController = new ClienteController();
		OrdineController ordineController = new OrdineController();
		
		prodottoController.insert();
		clienteController.insert();
		ordineController.insert();
		
		System.out.println("fine");
		

	}

}
