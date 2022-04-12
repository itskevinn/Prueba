package com.kevcode.PruebaEsprinBu.application.bank.person.services;

import com.kevcode.PruebaEsprinBu.application.bank.person.http.dto.PersonDto;
import com.kevcode.PruebaEsprinBu.application.bank.person.http.request.PersonRequest;

import java.util.List;

public interface IPersonService {
    PersonDto save(PersonRequest personRequest);

    List<PersonDto> findAll();

    PersonDto findById(int id);
}
