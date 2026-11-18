package it.exolab.view;

import java.util.List;

import it.exolab.model.Cliente;
import it.exolab.util.ScannerWrapper;

public class ClienteView {
	public void insert(Cliente model) {
		System.out.println("Inserisci dati del cliente");
		System.out.println("Digita nome:");
		String nome = ScannerWrapper.getInstance().getInput().nextLine();
		
		System.out.println("Digita cognome:");
		String cognome = ScannerWrapper.getInstance().getInput().nextLine();
		

		System.out.println("Digita indirizzo:");
		String indirizzo = ScannerWrapper.getInstance().getInput().nextLine();
		

		System.out.println("Digita citta:");
		String citta = ScannerWrapper.getInstance().getInput().nextLine();
		
		System.out.println("Digita telefono:");
		String telefono = ScannerWrapper.getInstance().getInput().nextLine();
		
		
		model.setNome(nome);
		model.setCognome(cognome);
		model.setIndirizzo(indirizzo);
		model.setCitta(citta);
		model.setTelefono(telefono);
		
		
	}
	public void print(List<Cliente> models) {
		System.out.println("Clienti");
		System.out.println("-----------------------------------");
		System.out.println("id\t\tnome");
		for(Cliente model: models) {
			
			System.out.println(model.getId()+"\t\t"+model.getNome());
			System.out.println("-----------------------------------");
		}
		System.out.println("-----------------------------------");
		
	}
}
