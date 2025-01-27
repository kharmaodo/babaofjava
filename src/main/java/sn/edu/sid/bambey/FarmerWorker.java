package sn.edu.sid.bambey;
/**
 * Un {@link FarmerWorker} est un {@link FarmerWorker} et implemente la fonctionalité {@link LocationPayment#paymentLocation()}
 */
public  class FarmerWorker extends Human {
	private Integer dailyHours ;
	
	
	public FarmerWorker() {
		super();
	}


	public FarmerWorker(Integer dailyHours) {
		super();
		this.dailyHours = dailyHours;
	}


	public String paymentLocation() {
		return "Valeur payéee : "+this.getDailyHours();
	}


	public Integer getDailyHours() {
		return dailyHours;
	}


	public void setDailyHours(Integer dailyHours) {
		this.dailyHours = dailyHours;
	}
	
	

}
