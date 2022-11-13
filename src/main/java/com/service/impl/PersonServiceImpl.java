package com.service.impl;

import com.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.repository.PersonRepository;
import com.service.PersonService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }

    @Override
    public List<Person> findPersons(String name) {
        return personRepository.findByFirstName(name);
    }

    @Override
    public void delete(String id) {
        personRepository.deleteById(id);
    }
}
