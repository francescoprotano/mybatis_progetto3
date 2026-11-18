package it.exolab.model;

public class Ordine {
	private Long id;
	private Long data_ordine;
	private Long id_cliente;
	private Long id_prodotto;
	private Cliente cliente;//<assocation>
	private Prodotto prodotto;
	private Float prezzo_acquisto;
	private Integer quantita_acquista;
	private int stato_lavorazione;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getData_ordine() {
		return data_ordine;
	}
	public void setData_ordine(Long data_ordine) {
		this.data_ordine = data_ordine;
	}
	public Long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Long getId_prodotto() {
		return id_prodotto;
	}
	public void setId_prodotto(Long id_prodotto) {
		this.id_prodotto = id_prodotto;
	}
	public Float getPrezzo_acquisto() {
		return prezzo_acquisto;
	}
	public void setPrezzo_acquisto(Float prezzo_acquisto) {
		this.prezzo_acquisto = prezzo_acquisto;
	}
	public Integer getQuantita_acquista() {
		return quantita_acquista;
	}
	public void setQuantita_acquista(Integer quantita_acquista) {
		this.quantita_acquista = quantita_acquista;
	}
	public int getStato_lavorazione() {
		return stato_lavorazione;
	}
	public void setStato_lavorazione(int stato_lavorazione) {
		this.stato_lavorazione = stato_lavorazione;
	}
	public Ordine(Long id_cliente, Long id_prodotto, Float prezzo_acquisto, Integer quantita_acquista) {
		super();
		this.id_cliente = id_cliente;
		this.id_prodotto = id_prodotto;
		this.prezzo_acquisto = prezzo_acquisto;
		this.quantita_acquista = quantita_acquista;
		
	}
	
	public Ordine() {
		super();
		
		
	}
	

}
