package sn.edu.sid.bambey.abstractions;

/**
 * Tea Preparation over the cultures !
 */
public abstract class TeaPreparation {
	
	public final void prepareTea() {
		boilWater();
		addTea();
		steepTea();
		serveTea();
	}

	public abstract void addTea();
	public abstract void steepTea();
	public abstract void serveTea();

	public void boilWater() {
		System.out.println("Bouillir l'eau ");
	}

}
