package sn.edu.sid.bambey;
/**
 * Un(e) étudiant(e) et un ouvrier qui vont utiliser la fonctionalité de paiement
 */
public class HumanPaymentFabric {

	public static void main(String[] args) {
		Human humain = new Human("Habibatou", "Diallo", Genre.FEMALE, "eXXXXXXX", "habibatou.diallo@somewhere",
				"76xxxxx", 90876);
		Student student = new Student("666666",humain);
		//Creer un ouvrier ; on cree un human
		Human humain_ouvrier = new Human("Aliw", "Mbaye", Genre.MALE, "fXXXXXXX", "aliw.mbaye@qqpart",
				"78xxxxx", 99978);
		
		HomeWorker ouvrier = new HomeWorker(3000,humain_ouvrier);
		
		//Afficher la fonctionnalité de paiement d'abord pour l'étudiant
		String location_student = student.paymentLocation();
		System.out.println("==========="+location_student);
		//Afficher la fonctionnalité de paiement d'abord pour l'ouvrier
		String location_ouvrier = ouvrier.paymentLocation();
		System.out.println("<<<<<<<<<<<<"+location_ouvrier);
		
		
		Human humain_travailler = new Human("Habibatou", "DIALLO", Genre.FEMALE, "YYYYYY", "bib@gmail.sn",
				"78xxxxx", 3434);
		FarmerWorker travailler = new FarmerWorker(7876,humain_travailler);
		
		//Afficher la fonctionnalité de paiement d'abord pour un travailler
		String location_travailler = travailler.paymentLocation();
		System.out.println("<<<<<<<<<<<<"+location_travailler);
	
		
		Human humain_travailler1 = new Human("Ousmane Tanou", "DIALLO", Genre.MALE, "XXXX", "ousmanet@gmail.sn",
				"77xxxxx", 2676);
		FarmerWorker travailler1 = new FarmerWorker(2323,humain_travailler1);
		
		//Afficher la fonctionnalité de paiement d'abord pour un travailler
		String location_travailler1 = travailler1.paymentLocation();
		System.out.println("<<<<<<<<<<<<"+location_travailler1);
	}

}
