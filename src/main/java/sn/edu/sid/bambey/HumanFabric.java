/**
 * 
 */
package sn.edu.sid.bambey;

import java.util.Date;

/**
 * Créons deux ou trois homo sapiens sapiens
 */
public class HumanFabric {
	public static void main(String[] args) {
		Human humain1 = new Human("Samba","Kébé",Genre.MALE,"xxxxxxxxxx","samba@gmail.com","776666666666",12456789);
		printInformation(humain1);
		
		Human humain2 = new Human("Habibatou", "Diallo", Genre.FEMALE, "eXXXXXXX", "habibatou.diallo@somewhere", "76xxxxx", 90876);//2eme approche avec le full constructeur
		printInformation(humain2);

		
		Human humain3 = new Human("Ngor", "Diop", Genre.MALE, "fXXXXXXX", "ngor.diop@somewhere", "768888", 90888);//2eme approche avec le full constructeur
		printInformation(humain3);
		
		 Student student1 = new Student("555555",humain1);
		 
		 printInformationStudent(student1);

		 Student student2 = new Student("666666",humain2);
		 printInformationStudent(student2);

		 
		 System.out.println("Paiements pour l'étudiant"+student1.humanDetails().firstName());
		 String paiementInscription = student1.payerInscription(new Date(), 25000, student1.matricule());
		 String paiementRestauration = student1.payerRestauration(100, student1.matricule());
		 System.out.println("Paiements Inscription: "+paiementInscription);
		 System.out.println("Paiements Restauration: "+paiementRestauration);
		 
		
	}

	/**
	 * Information de l'étudiant(e) en tant que record
	 * 
	 * @param student1
	 */
	private static void printInformationStudent(Student student1) {
		System.out.println("Student 1 FirstName:  "+student1.humanDetails().firstName()+" LastName:" + student1.humanDetails().lastName()+ " Email: "+student1.humanDetails().email()+" Telephone: "+student1.humanDetails().telephone()+" Matricule: "+student1.matricule());
	}

	/**
	 * Information de l'human en tant que record 
	 * @param humain2
	 */
	private static void printInformation(Human humain2) {
		System.out.println("Humain 2 FirstName:  "+humain2.firstName()+" LastName:" + humain2.lastName()+ " Email: "+humain2.email()+" Telephone: "+humain2.telephone());
	}

}
