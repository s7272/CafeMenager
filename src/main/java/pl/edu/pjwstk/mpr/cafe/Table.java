package pl.edu.pjwstk.mpr.cafe;

public class Table {
	private Integer number;
	private Integer numOfSeats;
	private boolean isBusy;
	
	public Table() {

	}

	public Table(Integer number, Integer numOfSeats, boolean isBusy) {
		this.number = number;
		this.numOfSeats = numOfSeats;
		this.isBusy = isBusy;
	}

	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Integer getNumOfSeats() {
		return numOfSeats;
	}
	
	public void setNumOfSeats(Integer numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	
	public boolean isBusy() {
		return isBusy;
	}
	
	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}
	
}
