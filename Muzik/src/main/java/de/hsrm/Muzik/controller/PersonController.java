package de.hsrm.Muzik.controller;

import de.hsrm.Muzik.baseClass.Person;
import de.hsrm.Muzik.dto.PersonRequest;
import de.hsrm.Muzik.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository){
        this.repository = repository;
    }

    //addNewPerson method with mail check we use this method in newPerson => Post request
    public void addNewPerson(Person person) {
        Optional<Person> personOptional = repository
                .findPersonByEmail(person.getMail());
        if(personOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        repository.save(person);
    }

    @PostMapping("")
    public void newPerson(@RequestBody Person newPerson){
        addNewPerson(newPerson);
    }

    @GetMapping("")
    public List<Person> all(){
        return repository.findAll();
    }

}
