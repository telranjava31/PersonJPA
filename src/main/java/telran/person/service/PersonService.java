package telran.person.service;

import telran.person.dto.PersonDto;

public interface PersonService {
	
	boolean addPerson(PersonDto personDto);
	
	PersonDto findPersonById(int id);
	
	Iterable<PersonDto> findPersonsByName(String name);
	
	Iterable<PersonDto> findPersonsByAges(int min, int max);
	
	Iterable<PersonDto> findPersonByCity(String city);
	
	Iterable<PersonDto> findEmployeesBySalary(int min, int max);
	
	Iterable<PersonDto> findChildren();

}
