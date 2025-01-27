package sn.edu.sid.bambey.abstraction;
/**
 * Classe d'abstraction pour la préparation de thé de façon universelle.
 */
public  abstract class TeaPreparation {
	// Template method for preparing tea (common sequence of steps)
    public final void prepareTea() {
        boilWater();
        addTea();
        steepTea();
        serveTea();
    }
    
 // Shared behavior: Boil water
    public void boilWater() {
        System.out.println("Boiling water...");
    }

    // Shared behavior: Serve tea
    public void serveTea() {
        System.out.println("Serving tea in a traditional cup.");
    }

    // Abstract method: Add tea (specific to the culture)
    public abstract void addTea();

    // Abstract method: Steep tea (specific to the culture)
    public abstract void steepTea();
}
