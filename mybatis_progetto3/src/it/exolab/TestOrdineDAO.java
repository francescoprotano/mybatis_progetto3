package it.exolab;

import java.util.List;

import it.exolab.dao.OrdineDAO;
import it.exolab.model.Ordine;

public class TestOrdineDAO {

	public static void main(String[] args) {
		List<Ordine> ordini = OrdineDAO.getInstance().findAllJoinProdottoECliente();
		for(Ordine ordine: ordini) {
			System.out.println(ordine.getCliente().getCognome());
		}
		

	}

}
