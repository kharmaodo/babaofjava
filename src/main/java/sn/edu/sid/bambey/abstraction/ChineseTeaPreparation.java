package sn.edu.sid.bambey.abstraction;
/**
 * Preparation à la chinoise.
 */
public class ChineseTeaPreparation extends TeaPreparation {

	@Override
	public void addTea() {
		 System.out.println("Adding loose-leaf green tea to a gaiwan.");
	}

	@Override
	public void steepTea() {
		  System.out.println("Steeping the tea for 30 seconds using multiple infusions.");

	}

}
