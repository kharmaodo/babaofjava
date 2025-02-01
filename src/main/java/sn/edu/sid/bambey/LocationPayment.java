package sn.edu.sid.bambey;
/**
 * Interface qui propose la fonctionnalité de paiement. Aux classes d'implementer leur
 * propre convenance de cette fonctionnalité.
 */
public sealed interface LocationPayment permits Student,FarmerWorker{
	 String paymentLocation();
}
