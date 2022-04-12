package com.kevcode.PruebaEsprinBu.api.controllers;

import com.kevcode.PruebaEsprinBu.application.bank.person.http.dto.PersonDto;
import com.kevcode.PruebaEsprinBu.application.bank.person.http.request.PersonRequest;
import com.kevcode.PruebaEsprinBu.application.bank.person.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Person")
public class PeopleController {
    private final PersonService _personService;

    @Autowired
    public PeopleController(PersonService personService) {
        _personService = personService;
    }

    @GetMapping("/GetAll")
    public List<PersonDto> getAll() {
        return _personService.findAll();
    }

    @GetMapping("/GetById/{personId}")
    public PersonDto getById(@PathVariable int personId) {
        return _personService.findById(personId);
    }

    @PostMapping("/Create")
    public PersonDto create(@RequestBody PersonRequest personRequest) {
        return _personService.save(personRequest);
    }
}
