package Produits;

public class Machine {
	private int id;
	private String nom;
	private String etat;
	private int stock;

	public Machine(int id, String nom, String etat,int stock) {
		this.id = id;
		this.nom = nom;
		this.etat = etat;
		this.stock=stock;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return etat;
	}

	public void setDescription(String etat) {
		this.etat = etat;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void ajouterAuStock(int quantite) {
		this.stock += quantite;
	}

	public void retirerDuStock(int quantite) {
		assert this.stock >= quantite : "Le stock de " + this.nom + " est insuffisant. Stock disponible : " + this.stock + ", quantité demandée : " + quantite;
		this.stock -= quantite;
	}
}
