package com.service;

import com.domain.Person;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> findPersons(String name);

    void delete(String id);
}
