package telran.person.model;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Child extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String kindergarten;

	public Child(int id, String name, LocalDate birthDate, Address address, String kindergarten) {
		super(id, name, birthDate, address);
		this.kindergarten = kindergarten;
	}

}
