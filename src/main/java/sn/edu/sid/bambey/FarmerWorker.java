package sn.edu.sid.bambey;

/**
 * Un {@link FarmerWorker} est un {@link FarmerWorker} et implemente la
 * fonctionalité {@link LocationPayment#paymentLocation()}
 */
public record FarmerWorker(Integer dailyHours, Human humanDetails) {

	public String paymentLocation() {
		return "Paiement fait par le paysant"+humanDetails.firstName() +"" +humanDetails.lastName();
	}
}
