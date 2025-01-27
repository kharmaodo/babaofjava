package sn.edu.sid.bambey;
/**
 * Interface qui propose la fonctionnalité de paiement. Aux classes d'implementer leur
 * propre convenance de cette fonctionnalité.
 */
public sealed interface  LocationPayment  permits HomeWorker,Student {
	default String paymentLocation(String identifier) {
        return "Paiement fait par l'entité identifiée par [" + identifier + "]";
    }
}
