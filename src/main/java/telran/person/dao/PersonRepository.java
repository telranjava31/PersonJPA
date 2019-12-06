package telran.person.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.person.dto.CityPopulationDto;
import telran.person.model.Child;
import telran.person.model.Employee;
import telran.person.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	Stream<Person> findByName(String name);

	List<Person> findByBirthDateBetween(LocalDate from, LocalDate to);
	
	List<Person> findByAddressCity(String city);
	
	List<Employee> findBySalaryBetween(int min, int max);

	List<Child> findBy();
	
	@Query("select new telran.person.dto.CityPopulationDto(p.address.city, count(p)) from Person p group by p.address.city order by count(p) desc")
	List<CityPopulationDto> getCityPopulation();
}
