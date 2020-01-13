package es.uca.muiisc.psi;
import java.time.LocalDate;

public class Guest {
	private String firstName;
	private String lastName;
	private String passport;
	private LocalDate dateBirth;
	private String phoneNumber;
	
	public Guest(String firstName, String lastName, String passport, LocalDate dateBirth, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.passport = passport;
		this.dateBirth = dateBirth;
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public LocalDate getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
