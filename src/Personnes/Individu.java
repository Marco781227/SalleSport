package Personnes;

public class Individu {
	private int id;
	private String nom;
	private String email;
	private String numeroDeTelephone;
	private String adresse;

	public Individu(int id, String nom, String email, String numeroDeTelephone, String adresse) {
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.numeroDeTelephone = numeroDeTelephone;
		this.adresse = adresse;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
