package sn.edu.sid.bambey;
/**
 * Un(e) étudiant(e) et un ouvrier qui vont utiliser la fonctionalité de paiement
 */
public class HumanPaymentFabric {

	public static void main(String[] args) {
		Human humain = new Human("Habibatou", "Diallo", Genre.FEMALE, "eXXXXXXX", "habibatou.diallo@somewhere",
				"76xxxxx", 90876);
		Student student = new Student("666666");
		student.setFirstName(humain.getFirstName());
		student.setLastName(humain.getLastName());
		student.setDigitalEmpreinte(humain.getDigitalEmpreinte());
		student.setEmail(humain.getEmail());
		student.setGenre(humain.getGenre());
		student.setIdCard(humain.getIdCard());
		student.setTelephone(humain.getTelephone());
		
		//Creer un ouvrier ; on cree un human
		Human humain_ouvrier = new Human("Aliw", "Mbaye", Genre.MALE, "fXXXXXXX", "aliw.mbaye@qqpart",
				"78xxxxx", 99978);
		
		HomeWorker ouvrier = new HomeWorker(3000);
		ouvrier.setFirstName(humain_ouvrier.getFirstName());
		ouvrier.setLastName(humain_ouvrier.getLastName());
		ouvrier.setDigitalEmpreinte(humain_ouvrier.getDigitalEmpreinte());
		ouvrier.setEmail(humain_ouvrier.getEmail());
		ouvrier.setGenre(humain_ouvrier.getGenre());
		ouvrier.setIdCard(humain_ouvrier.getIdCard());
		ouvrier.setTelephone(humain_ouvrier.getTelephone());
		
		//Afficher la fonctionnalité de paiement d'abord pour l'étudiant
		String location_student = student.paymentLocation();
		System.out.println("==========="+location_student);
		//Afficher la fonctionnalité de paiement d'abord pour l'ouvrier
		String location_ouvrier = ouvrier.paymentLocation();
		System.out.println("<<<<<<<<<<<<"+location_ouvrier);
		
		
		Human humain_travailler = new Human("Habibatou", "DIALLO", Genre.FEMALE, "YYYYYY", "bib@gmail.sn",
				"78xxxxx", 3434);
		FarmerWorker travailler = new FarmerWorker(7876);
		travailler.setFirstName(humain_travailler.getFirstName());
		travailler.setLastName(humain_travailler.getLastName());
		travailler.setDigitalEmpreinte(humain_travailler.getDigitalEmpreinte());
		travailler.setEmail(humain_travailler.getEmail());
		travailler.setGenre(humain_travailler.getGenre());
		travailler.setIdCard(humain_travailler.getIdCard());
		travailler.setTelephone(humain_travailler.getTelephone());
	
		
		//Afficher la fonctionnalité de paiement d'abord pour un travailler
		String location_travailler = travailler.paymentLocation();
		System.out.println("<<<<<<<<<<<<"+location_travailler);
	
		
		Human humain_travailler1 = new Human("Ousmane Tanou", "DIALLO", Genre.MALE, "XXXX", "ousmanet@gmail.sn",
				"77xxxxx", 2676);
		FarmerWorker travailler1 = new FarmerWorker(2323);
		travailler1.setFirstName(humain_travailler1.getFirstName());
		travailler1.setLastName(humain_travailler1.getLastName());
		travailler1.setDigitalEmpreinte(humain_travailler1.getDigitalEmpreinte());
		travailler1.setEmail(humain_travailler1.getEmail());
		travailler1.setGenre(humain_travailler1.getGenre());
		travailler1.setIdCard(humain_travailler1.getIdCard());
		travailler1.setTelephone(humain_travailler1.getTelephone());
	
		
		//Afficher la fonctionnalité de paiement d'abord pour un travailler
		String location_travailler1 = travailler1.paymentLocation();
		System.out.println("<<<<<<<<<<<<"+location_travailler1);
	}

}
