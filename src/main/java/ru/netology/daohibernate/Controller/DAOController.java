package ru.netology.daohibernate.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.daohibernate.Entity.Persons;
import ru.netology.daohibernate.Repository.DAORepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class DAOController {

    private DAORepository repository;

    @GetMapping("/persons/by-city")
    public List<Persons> getPersons(@RequestParam("city") String city){
        return repository.getPersonsByCity(city);
    }
}
