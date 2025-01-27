package sn.edu.sid.bambey;

import java.util.Date;

/**
 * Un(e) Etudiant(e) est un(e) Human POJO qui doit implementer la fonctionnalité
 * de paiements
 */
public record Student(String matricule, Human humanDetails) implements LocationPayment {
	public String paymentLocation() {
		return LocationPayment.super.paymentLocation(matricule);
	}
	public String payerRestauration(Integer ticket) {
        return "Restauration avec le ticket: [" + ticket + "] et la matricule: [" + matricule + "]";
    }

    public String payerInscription(Date inscriptionDate, Integer ticketInscription) {
        return "Inscription avec la date: [" + inscriptionDate + "], le ticket: [" + ticketInscription + "], et la matricule: [" + matricule + "]";
    }

	public String payerLocation(Date date, String matricule2) {
		return LocationPayment.super.paymentLocation(matricule) + "à la date du: "+date;
	}
}
