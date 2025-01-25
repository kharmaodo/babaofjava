/**
 * 
 */
package sn.edu.sid.bambey;

import java.util.Date;

/**
 * Créons deux ou trois homo sapiens sapiens
 */
public class HumanFabric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Human humain1 = new Human(); //1ere approche avec un constructeur par défaut (vide)
		humain1.setFirstName("Samba");
		humain1.setLastName("Kébé");
		humain1.setDigitalEmpreinte("xxxxxxxxxx");
		humain1.setEmail("samba@gmail.com");
		humain1.setGenre(Genre.MALE);
		humain1.setIdCard(12456789);
		humain1.setTelephone("776666666666");
		System.out.println("Humain 1 FirstName:  "+humain1.getFirstName()+" LastName:" + humain1.getLastName()+ " Email: "+humain1.getEmail()+" Telephone: "+humain1.getTelephone());

		
		Human humain2 = new Human("Habibatou", "Diallo", Genre.FEMALE, "eXXXXXXX", "habibatou.diallo@somewhere", "76xxxxx", 90876);//2eme approche avec le full constructeur
		printInformation(humain2);

		
		Human humain3 = new Human("Ngor", "Diop", Genre.MALE, "fXXXXXXX", "ngor.diop@somewhere", "768888", 90888);//2eme approche avec le full constructeur
		printInformation(humain3);
		
		 Student student1 = new Student("555555");
		
		 student1.setFirstName(humain1.getFirstName());
		 student1.setLastName(humain1.getLastName());
		 student1.setDigitalEmpreinte(humain1.getDigitalEmpreinte());
		 student1.setEmail(humain1.getEmail());
		 student1.setGenre(humain1.getGenre());
		 student1.setIdCard(humain1.getIdCard());
		 student1.setTelephone(humain1.getTelephone());
		 
		 printInformationStudent(student1);

		 Student student2 = new Student("666666");
		 student2.setFirstName(humain2.getFirstName());
		 student2.setLastName(humain2.getLastName());
		 student2.setDigitalEmpreinte(humain2.getDigitalEmpreinte());
		 student2.setEmail(humain2.getEmail());
		 student2.setGenre(humain2.getGenre());
		 student2.setIdCard(humain2.getIdCard());
		 student2.setTelephone(humain2.getTelephone());
		 printInformationStudent(student2);

		 
		 System.out.println("Paiements pour l'étudiant"+student1.getFirstName());
		// String paiementLocation = student1.payerLocation(new Date(),student1.getMatricule());
		 String paiementInscription = student1.payerInscription(new Date(), 25000, student1.getMatricule());
		 String paiementRestauration = student1.payerRestauration(100, student1.getMatricule());
		// System.out.println("Paiements Location: "+paiementLocation);
		 System.out.println("Paiements Inscription: "+paiementInscription);
		 System.out.println("Paiements Restauration: "+paiementRestauration);
		 
		
	}

	/**
	 * Information de l'étudiant(e)
	 * 
	 * @param student1
	 */
	private static void printInformationStudent(Student student1) {
		System.out.println("Student 1 FirstName:  "+student1.getFirstName()+" LastName:" + student1.getLastName()+ " Email: "+student1.getEmail()+" Telephone: "+student1.getTelephone()+" Matricule: "+student1.getMatricule());
	}

	/**
	 * Information de l'human
	 * @param humain2
	 */
	private static void printInformation(Human humain2) {
		System.out.println("Humain 2 FirstName:  "+humain2.getFirstName()+" LastName:" + humain2.getLastName()+ " Email: "+humain2.getEmail()+" Telephone: "+humain2.getTelephone());
	}

}
