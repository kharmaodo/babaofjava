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
	public String payerInscription(Date date, int id, String idMatricule) {
		return "Paiement Inscription" + date + "  par : " + id + "avec le matricule" + idMatricule;
	}

	public String payerRestauration(int id, String idMatricule) {
		return "Paiement Inscription" + id + "avec le matricule" + idMatricule;
	}

	public String payerLocation(Date date, String matricule2) {
		return LocationPayment.super.paymentLocation(matricule) + "à la date du: "+date;
	}
}
