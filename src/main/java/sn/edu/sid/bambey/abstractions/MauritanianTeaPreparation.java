package sn.edu.sid.bambey.abstractions;

/**
 * How Mauritanians prepare tea
 */
public class MauritanianTeaPreparation extends TeaPreparation {

	@Override
	public void addTea() {
		System.out.println("Mettre une moitié de la moitié d'une poignée de thé");

	}

	@Override
	public void steepTea() {
		System.out.println("Infuse le thé");

	}

	@Override
	public void serveTea() {
System.out.println("Servir le thé avec des tasses trés traditionnelles avec trois reprises !");
	}

}
