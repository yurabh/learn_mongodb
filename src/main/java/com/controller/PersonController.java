package com.controller;

import com.domain.Person;
import lombok.RequiredArgsConstructor;
import com.service.PersonService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @PostMapping
    public String save(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping
    public List<Person> findPersons(@RequestParam("name") String name) {
        return personService.findPersons(name);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable String id) {
        personService.delete(id);
    }
}
