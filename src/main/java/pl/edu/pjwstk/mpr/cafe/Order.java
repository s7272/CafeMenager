package pl.edu.pjwstk.mpr.cafe;

import java.util.List;

import pl.edu.pjwstk.mpr.person.Waitress;

public class Order {
	private Cafe cafe;
	private Waitress empl;
	private Translator trans;
	private List<MenuPosition> menuPosition;
	private Double amount;
	
	public Order() {
		
	}

	public Order(Cafe cafe, Waitress empl, Translator trans,
			List<MenuPosition> menuPosition, Double amount) {
		this.cafe = cafe;
		this.empl = empl;
		this.trans = trans;
		this.menuPosition = menuPosition;
		this.amount = amount;
	}

	public Cafe getCafe() {
		return cafe;
	}
	
	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}
	
	public Waitress getEmpl() {
		return empl;
	}
	
	public void setEmpl(Waitress empl) {
		this.empl = empl;
	}
	
	public Translator getTrans() {
		return trans;
	}
	
	public void setTrans(Translator trans) {
		this.trans = trans;
	}
	
	public List<MenuPosition> getMenuPosition() {
		return menuPosition;
	}
	
	public void setMenuPosition(List<MenuPosition> menuPosition) {
		this.menuPosition = menuPosition;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
