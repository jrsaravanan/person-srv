package org.example.person.service;

import java.util.ArrayList;
import java.util.List;

import org.example.person.vo.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> getAll() {

        List<Person> list = new ArrayList<>();
        Person person = new Person(1L, "sai", "NA");
        list.add(person);
        return list;
    }
}