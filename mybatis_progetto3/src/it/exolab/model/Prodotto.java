package it.exolab.model;

public class Prodotto {
	
	private Long id;
	private String nome;
	//esercizio 4
	private Float prezzo;
	private Integer quantita_disponibile;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}
	public Integer getQuantita_disponibile() {
		return quantita_disponibile;
	}
	public void setQuantita_disponibile(Integer quantita_disponibile) {
		this.quantita_disponibile = quantita_disponibile;
	}
	public Prodotto( String nome) {
		super();
		this.nome = nome;
	}
	public Prodotto() {
		super();
		
	}

}
