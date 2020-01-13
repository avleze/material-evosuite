import java.util.ArrayList;
package es.uca.muiisc.psi;

public class Room {
	private int number;
	private ArrayList<Reservation> reservations = new ArrayList<>();
	
	public Room(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public ArrayList<Reservation> getReservations() {
		return reservations;
	}	
	
}
