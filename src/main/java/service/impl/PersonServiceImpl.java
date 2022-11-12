package service.impl;

import domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.PersonRepository;
import service.PersonService;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }
}
