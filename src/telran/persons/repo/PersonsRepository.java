package telran.persons.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import telran.persons.dto.Person;
@Repository
public interface PersonsRepository extends MongoRepository<Person, Integer>{

}
