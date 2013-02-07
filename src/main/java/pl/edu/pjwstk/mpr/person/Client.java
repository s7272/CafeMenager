package pl.edu.pjwstk.mpr.person;

public class Client {
	private Integer numOfPersons;
	private Double wallet;
	
	public Client() {

	}

	public Client(Integer numOfPersons, Double wallet) {
		this.numOfPersons = numOfPersons;
		this.wallet = wallet;
	}

	public Integer getNumOfPersons() {
		return numOfPersons;
	}

	public void setNumOfPersons(Integer numOfPersons) {
		this.numOfPersons = numOfPersons;
	}

	public Double getWallet() {
		return wallet;
	}

	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}

}
