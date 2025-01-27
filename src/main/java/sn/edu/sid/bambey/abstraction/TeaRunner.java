package sn.edu.sid.bambey.abstraction;

/**
 * Préparons le thé à travers les cultures !
 */
public class TeaRunner {
	public static void main(String[] args) {
		System.out.println("Chinese Tea Preparation:");
		TeaPreparation chineseTea = new ChineseTeaPreparation();
		chineseTea.prepareTea();

		System.out.println("\nJapanese Tea Preparation:");
		TeaPreparation japaneseTea = new JapaneseTeaPreparation();
		japaneseTea.prepareTea();

		System.out.println("\nOther Culture Tea Preparation:");
		TeaPreparation otherCultureTea = new OtherCultureTeaPreparation();
		otherCultureTea.prepareTea();
		
	}
}
