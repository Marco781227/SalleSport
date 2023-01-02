package Produits;

public class Aliment {
	private int id;
	private String nom;
	private String description;
	private double prix;
	private int stock;

	public Aliment(int id, String nom, String description, double prix, int stock) {
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.stock = stock;
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
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
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

