package sn.edu.sid.bambey.abstractions;
/**
 * How cultures prepare their own tea !
 */
public class TeaBuilder {
	public static void main(String[] args) {
		TeaPreparation galsenTea = new GalsenTeaPreparation();
		howToPrepareTea(galsenTea, "Senegal");
		TeaPreparation naarTea = new MauritanianTeaPreparation();
		howToPrepareTea(naarTea, "Mauritanie");
		
		TeaPreparation tangana = new MalianTeaPreparation();
		howToPrepareTea(tangana, "Mali");
	}

	/**
	 * Provides steps to prepare tea over the cultures ! 
	 * 
	 * @param teaPreparation current concrete class
	 * @param nationality the current nationality
	 */
	private static void howToPrepareTea(TeaPreparation teaPreparation, String nationality) {
		System.out.println(">> Debut de préparation du thé: "+nationality);
		teaPreparation.prepareTea();
		System.out.println(">> Fin préparation du thé: "+nationality);
	}
}
