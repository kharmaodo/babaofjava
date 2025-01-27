package sn.edu.sid.bambey;

/**
 * Un(e) étudiant(e) et un ouvrier qui vont utiliser la fonctionalité de
 * paiement
 */
public class HumanPaymentFabric {

	public static void main(String[] args) {
		Human humain = new Human("Habibatou", "Diallo", Genre.FEMALE, "eXXXXXXX", "habibatou.diallo@somewhere",
				"76xxxxx", 90876);
		Student student = new Student("666666", humain);
		// Creer un ouvrier ; on cree un human
		Human humain_ouvrier = new Human("Aliw", "Mbaye", Genre.MALE, "fXXXXXXX", "aliw.mbaye@qqpart", "78xxxxx",
				99978);

		HomeWorker ouvrier = new HomeWorker(3000, humain_ouvrier);

		// Afficher la fonctionnalité de paiement d'abord pour l'étudiant
		String location_student = student.paymentLocation();
		System.out.println("===========" + location_student);
		// Afficher la fonctionnalité de paiement d'abord pour l'ouvrier
		String location_ouvrier = ouvrier.paymentLocation();
		System.out.println("<<<<<<<<<<<<" + location_ouvrier);

		Human humain_paysan = new Human("Ngor", "DIOUF", Genre.MALE, "gXXXXXXX", null, null, 99978);
		FarmerWorker paysan = new FarmerWorker(1500, humain_paysan);

		// Afficher la fonctionnalité de paiement d'abord pour l'étudiant
		String location_paysan = paysan.paymentLocation();
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" Location du Paysant [" + paysan.humanDetails().lastName() + "  "
				+ paysan.humanDetails().firstName() + "  ] Location : " + location_paysan);
		System.out.println("---------------------------------------------------------------------");
	}

}
