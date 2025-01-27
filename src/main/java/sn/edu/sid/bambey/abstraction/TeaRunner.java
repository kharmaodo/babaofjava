package sn.edu.sid.bambey.abstraction;

/**
 * Préparons le thé à travers les cultures !
 */
public class TeaRunner {
	public static void main(String[] args) {
		TeaPreparation chineseTea = new ChineseTeaPreparation();
		TeaPreparation japaneseTea = new JapaneseTeaPreparation();
		TeaPreparation otherCultureTea = new OtherCultureTeaPreparation();
		 processTeaPreparation(chineseTea);
		 processTeaPreparation(japaneseTea);
		 processTeaPreparation(otherCultureTea);
	}

	/**
	 * Process Tea Preparation with pattern matching
	 * 
	 * @param teaPreparation
	 */
	private static void processTeaPreparation(TeaPreparation teaPreparation) {
		// Enhanced switch with pattern matching
        switch (teaPreparation) {
            case ChineseTeaPreparation chinese -> {
                System.out.println("Processing Chinese Tea Preparation:");
                chinese.prepareTea();
            }
            case JapaneseTeaPreparation japanese -> {
                System.out.println("Processing Japanese Tea Preparation:");
                japanese.prepareTea();
            }
            case OtherCultureTeaPreparation other -> {
                System.out.println("Processing Other Culture Tea Preparation:");
                other.prepareTea();
            }
            default -> throw new IllegalArgumentException("Unknown tea preparation style");
        }	
		
	}
}
