package sn.edu.sid.bambey.abstractions.management;

/**
 * Provides tests againts {@link AbstractAnimal}
 */
public class AnimalCreator {
	public static void main(String[] args) {
		AbstractAnimal chevalAile= new ChevailAile();
		displayAnimal(chevalAile, "ChevailAilé");
		
		AbstractAnimal dragon = new DragonIgnivore();
		displayAnimal(dragon, "DragonIgnivore");
	}

	/**
	 * Display animal's behaviors
	 * 
	 * @param animal current animal {@link AbstractAnimal}
	 * @param typeOfAnimal type of animal 
	 * 
	 */
	private static void displayAnimal(AbstractAnimal animal, String typeOfAnimal) {
		System.out.println("["+typeOfAnimal+"] "+  animal.voler() +"  "+ animal.cracherDuFeu());
	}

}
