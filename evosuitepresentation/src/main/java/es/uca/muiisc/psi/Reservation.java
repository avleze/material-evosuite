import java.time.LocalDate;
package es.uca.muiisc.psi;

public class Reservation {
	private LocalDate dateChekin;
	private LocalDate dateChekout;
	private Guest guest;
	
	public Reservation(LocalDate dateChekin, LocalDate dateChekout, Guest guest) {
		this.dateChekin = dateChekin;
		this.dateChekout = dateChekout;
		this.guest = guest;
	}
	
	public LocalDate getDateChekin() {
		return dateChekin;
	}

	public void setDateChekin(LocalDate dateChekin) {
		this.dateChekin = dateChekin;
	}

	public LocalDate getDateChekout() {
		return dateChekout;
	}

	public void setDateChekout(LocalDate dateChekout) {
		this.dateChekout = dateChekout;
	}
	
	public Guest getGuest() {
		return guest;
	}
	
	
	
	
}
