package it.exolab.view;

import java.util.List;

import it.exolab.model.Ordine;
import it.exolab.util.ScannerWrapper;

public class OrdineView {
	
	public Long getId() {
		System.out.println("Digita id Ordine:");
		Long id = Long.valueOf(  ScannerWrapper.getInstance().getInput().nextLine());
		return id;
			
	}
	public void insert(Ordine model) {
		System.out.println("Inserisci dati dell'ordine");
		System.out.println("Digita id cliente:");
		Long id_cliente = Long.valueOf(  ScannerWrapper.getInstance().getInput().nextLine());
		
		System.out.println("Digita id prodotto:");
		Long id_prodotto = Long.valueOf(  ScannerWrapper.getInstance().getInput().nextLine());
		
		System.out.println("Digita quantità:");
		Integer quantita = Integer.valueOf(  ScannerWrapper.getInstance().getInput().nextLine());
		
		model.setId_cliente(id_cliente);
		model.setId_prodotto(id_prodotto);
		model.setQuantita_acquista(quantita);
		
		
	}
	public void print(List<Ordine> models) {
		for(Ordine model: models) {
			System.out.println(model.getId());
		}
		
	}
}
