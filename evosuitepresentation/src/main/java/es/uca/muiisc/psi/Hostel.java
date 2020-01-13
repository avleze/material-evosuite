package es.uca.muiisc.psi;
import java.time.LocalDate;

public class Hostel {
	Room[] rooms;
	
	public Hostel() {
		rooms = new Room[10];
		for(int i = 0; i < 10; i++)
			rooms[i] = new Room(i + 1);
	}
	
	public void makeReservation(int numberRoom, LocalDate checkinDate, LocalDate checkoutDate, Guest guest) {
		boolean isFree = true;
		for (Reservation reservation: rooms[numberRoom].getReservations()){
			if(checkinDate.isAfter(reservation.getDateChekin()) && checkinDate.isBefore(checkoutDate)
				|| checkoutDate.isAfter(reservation.getDateChekin()) && checkoutDate.isBefore(reservation.getDateChekout())) {
				isFree = false;
				System.out.println("The room is already booked for that date");
			}
		}
		
		if(isFree) {
			rooms[numberRoom].getReservations().add(new Reservation(checkinDate, checkoutDate, guest));
			System.out.println("The room has been booked");
		}
	}
	
}
