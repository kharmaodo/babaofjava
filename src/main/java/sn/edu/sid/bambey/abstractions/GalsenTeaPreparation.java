package sn.edu.sid.bambey.abstractions;

/**
 * How senegalese prepare tea ! 
 */
public class GalsenTeaPreparation extends TeaPreparation {

	@Override
	public void addTea() {
		System.out.println("Ajouter tout le sachet du thé");
	}

	@Override
	public void steepTea() {
		System.out.println("Pas besoin d'infuser le thé");

	}

	@Override
	public void serveTea() {
		System.out.println("On va servir jusqu'au tarkhis !!!");

	}

}
