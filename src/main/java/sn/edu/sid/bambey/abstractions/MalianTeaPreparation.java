package sn.edu.sid.bambey.abstractions;
/**
 * How Malian prepare tea ! 
 */
public class MalianTeaPreparation extends TeaPreparation {

	@Override
	public void addTea() {
		System.out.println("Prendre une poignée de thé");

	}

	@Override
	public void steepTea() {
	System.out.println("Infuser le thé dans un autre barada !!!");
	}

	@Override
	public void serveTea() {
	System.out.println("Servir le thé à tout moment de la journée !");

	}

}
