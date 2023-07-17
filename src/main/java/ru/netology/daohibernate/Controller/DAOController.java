package ru.netology.daohibernate.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.daohibernate.Entity.Persons;
import ru.netology.daohibernate.Repository.DAORepository;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/persons")
public class DAOController {

    private DAORepository repository;

    @GetMapping("/by-city")
    public List<Persons> getPersons(@RequestParam("city") String city){
        return repository.getPersonsByCity(city);
    }
    @GetMapping("/by-age")
    public List<Persons> getPersonsAge(@RequestParam("age") int age){
        return repository.getPersonsByAge(age);
    }
    @GetMapping("/name-and-surname")
    public Optional<Persons> getPersons(@RequestParam String name, @RequestParam String surname){
        return repository.getPersonsByNameAndSurname(name, surname);
    }
}
