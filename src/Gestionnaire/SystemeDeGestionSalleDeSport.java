package Gestionnaire;

import Personnes.Membre;
import Personnes.Personnel;

import Produits.Aliment;
import Produits.Machine;

public class SystemeDeGestionSalleDeSport {
	private Membre[] membres;
	private Machine[] machines;
	private Aliment[] aliments;
	private Personnel[] personnelList;
	private int nbMembres;
	private int nbMachines;
	private int nbAliments;
	private int nbPersonnel;

	public SystemeDeGestionSalleDeSport() {
		this.membres = new Membre[100];
		this.machines = new Machine[100];
		this.aliments = new Aliment[100];
		this.personnelList = new Personnel[100];
		this.nbMembres = 0;
		this.nbMachines = 0;
		this.nbAliments = 0;
		this.nbPersonnel = 0;
	}

	public void ajouterMembre(Membre membre) {
		assert nbMembres < 100 : "La salle de sport a atteint sa capacité maximale de membres";
		membres[nbMembres] = membre;
		nbMembres++;
	}

	public void retirerMembre(Membre membre) {
		for (int i = 0; i < nbMembres; i++) {
			if (membres[i] == membre) {
				membres[i] = membres[nbMembres - 1];
				nbMembres--;
				return;
			}
		}
		assert false : "Le membre à retirer n'a pas été trouvé";
	}

	public void ajouterMachine(Machine machine) {
		assert nbMachines < 100 : "La salle de sport a atteint sa capacité maximale de machines";
		machines[nbMachines] = machine;
		nbMachines++;
	}

	public void retirerMachine(Machine machine) {
		for (int i = 0; i < nbMachines; i++) {
			if (machines[i] == machine) {
				machines[i] = machines[nbMachines - 1];
				nbMachines--;
				return;
			}
		}
		assert false : "La machine à retirer n'a pas été trouvée";
	}

	public void ajouterAliment(Aliment aliment) {
		assert nbAliments < 100 : "La salle de sport a atteint sa capacité maximale d'aliments";
		aliments[nbAliments] = aliment;
		nbAliments++;
	}

	public void retirerAliment(Aliment aliment) {
		for (int i = 0; i < nbAliments; i++) {
			if (aliments[i] == aliment) {
				aliments[i] = aliments[nbAliments - 1];
				nbAliments--;
				return;
			}
		}
		assert false : "L'aliment à retirer n'a pas été trouvé";
	}

	public void ajouterPersonnel(Personnel personnel) {
		assert nbPersonnel < 100 : "La salle de sport a atteint sa capacité maximale de personnel";
		personnelList[nbPersonnel] = personnel;
		nbPersonnel++;
	}

	public void retirerPersonnel(Personnel personnel) {
		for (int i = 0; i < nbPersonnel; i++) {
			if (personnelList[i] == personnel) {
				personnelList[i] = personnelList[nbPersonnel - 1];
				nbPersonnel--;
				return;
			}
		}
		assert false : "Le personnel à retirer n'a pas été trouvé";
	}

	public Membre trouverMembreParId(int id) {
		for (int i = 0; i < nbMembres; i++) {
			if (membres[i].getId() == id) {
				return membres[i];
			}
		}
		return null;
	}

	public Machine trouverMachineParId(int id) {
		for (int i = 0; i < nbMachines; i++) {
			if (machines[i].getId() == id) {
				return machines[i];
			}
		}
		return null;
	}

	public Aliment trouverAlimentParId(int id) {
		for (int i = 0; i < nbAliments; i++) {
			if (aliments[i].getId() == id) {
				return aliments[i];
			}
		}
		return null;
	}

	public Personnel trouverPersonnelParId(int id) {
		for (int i = 0; i < nbPersonnel; i++) {
			if (personnel[i].getId() == id) {
				return personnel[i];
			}
		}
		return null;
	}
}



