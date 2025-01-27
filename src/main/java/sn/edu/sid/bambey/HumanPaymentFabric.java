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
		
		Human humain_paysan = new Human("Ngor", "DIOUF", Genre.MALE, "gXXXXXXX", null,
				null, 99978);
		
		FarmerWorker paysan = new FarmerWorker(1500);
		paysan.setFirstName(humain_paysan.getFirstName());
		paysan.setLastName(humain_paysan.getLastName());
		paysan.setDigitalEmpreinte(humain_paysan.getDigitalEmpreinte());
		paysan.setEmail(humain_paysan.getEmail());
		paysan.setGenre(humain_paysan.getGenre());
		paysan.setIdCard(humain_paysan.getIdCard());
		paysan.setTelephone(humain_paysan.getTelephone());
		
		//Afficher la fonctionnalité de paiement d'abord pour l'étudiant
				String location_paysan = paysan.paymentLocation();
				System.out.println("---------------------------------------------------------------------");
				System.out.println(" Location du Paysant ["+paysan.getLastName() +"  "+ paysan.getFirstName()+"  ] Location : "+location_paysan);
				System.out.println("---------------------------------------------------------------------");
	}

}
