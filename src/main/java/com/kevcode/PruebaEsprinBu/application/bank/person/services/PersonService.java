package com.kevcode.PruebaEsprinBu.application.bank.person.services;

import com.kevcode.PruebaEsprinBu.application.bank.person.http.dto.PersonDto;
import com.kevcode.PruebaEsprinBu.application.bank.person.http.request.PersonRequest;
import com.kevcode.PruebaEsprinBu.domain.bank.entities.Person;
import com.kevcode.PruebaEsprinBu.infrastructure.repositories.IPersonRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {
    private final IPersonRepository _personRepository;
    private final ModelMapper _modelMapper;

    @Autowired
    public PersonService(IPersonRepository personRepository, ModelMapper modelMapper) {
        _personRepository = personRepository;
        _modelMapper = modelMapper;
    }

    @Override
    public PersonDto save(PersonRequest personRequest) {
        Person person = _modelMapper.map(personRequest, Person.class);
        person = _personRepository.save(person);
        PersonDto personDto = _modelMapper.map(person, PersonDto.class);
        return personDto;
    }

    @Override
    public List<PersonDto> findAll() {
        List<Person> people = _personRepository.findAll();
        List<PersonDto> peopleDto = _modelMapper.map(people, new TypeToken<List<PersonDto>>() {
        }.getType());
        return peopleDto;
    }

    @Override
    public PersonDto findById(int id) {
        Person person = _personRepository.findById(id).orElse(null);
        PersonDto personDto = _modelMapper.map(person, PersonDto.class);
        return personDto;
    }
}
