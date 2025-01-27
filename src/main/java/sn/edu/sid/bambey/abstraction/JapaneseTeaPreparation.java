package sn.edu.sid.bambey.abstraction;
/**
 * Preparation à la japonaise.
 */
public class JapaneseTeaPreparation extends TeaPreparation {

	@Override
	public void addTea() {
		   System.out.println("Adding matcha powder to a bowl.");
	}

	@Override
	public void steepTea() {
		System.out.println("Whisking the matcha powder with hot water using a bamboo whisk.");

	}

}
