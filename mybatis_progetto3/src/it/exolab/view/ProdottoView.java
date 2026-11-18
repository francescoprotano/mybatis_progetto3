package it.exolab.view;

import java.util.List;
import java.util.Scanner;

import it.exolab.model.Cliente;
import it.exolab.model.Prodotto;
import it.exolab.util.ScannerWrapper;

public class ProdottoView {
	public void insert(Prodotto model) {
		System.out.println("Inserisci dati del prodotto");
		System.out.println("Digita nome:");
		String nome = ScannerWrapper.getInstance().getInput().nextLine();
		
		System.out.println("Digita prezzo:");
		Float prezzo = Float.valueOf( ScannerWrapper.getInstance().getInput().nextLine());
		
		System.out.println("Digita quantità:");
		Integer quantita = Integer.valueOf( ScannerWrapper.getInstance().getInput().nextLine());
		
		model.setNome(nome);
		model.setPrezzo(prezzo);
		model.setQuantita_disponibile(quantita);
		
	}
	public void print(List<Prodotto> models) {

		System.out.println("Prodotti");
		System.out.println("-----------------------------------");
		System.out.println("id\t\tnome");
		for(Prodotto model: models) {
			
			System.out.println(model.getId()+"\t\t"+model.getNome());
			System.out.println("-----------------------------------");
		}
		System.out.println("-----------------------------------");
		
	}

}
