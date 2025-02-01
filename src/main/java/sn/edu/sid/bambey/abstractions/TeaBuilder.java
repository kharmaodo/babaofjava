/**
 * 
 */
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
	 * @param galsenTea
	 * @param nationality TODO
	 */
	private static void howToPrepareTea(TeaPreparation galsenTea, String nationality) {
		System.out.println(">> Debut de préparation du thé: "+nationality);
		galsenTea.prepareTea();
		System.out.println(">> Fin préparation du thé: "+nationality);
	}
}
