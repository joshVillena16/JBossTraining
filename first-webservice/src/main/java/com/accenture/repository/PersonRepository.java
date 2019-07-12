package com.accenture.repository;
import java.util.ArrayList;
import java.util.List;

import com.accenture.model.Person;

public class PersonRepository {

	List<Person> persons;
	
	public PersonRepository() {
		
		persons = new ArrayList<Person>();
		
		Person person1 = new Person();
		person1.setFname("Mighty");
		person1.setLname("Mar");
		
		Person person2 = new Person();
		person2.setFname("Van");
		person2.setLname("Salcedo");
		
		Person person3 = new Person();
		person3.setFname("Macho");
		person3.setLname("Mat");
		
		Person person4 = new Person();
		person4.setFname("Reynald");
		person4.setLname("Valk");
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
	}
	
	public List<Person> getPersons(){
		return persons;
	}
}
