package ru.netology.daohibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.daohibernate.Entity.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public interface DAORepository extends JpaRepository<Persons, Long> {

     List<Persons> getPersonsByCity(String city);
     List<Persons> getPersonsByAge(int age);
     Optional<Persons> getPersonsByNameAndSurname(String name, String surname);
}
