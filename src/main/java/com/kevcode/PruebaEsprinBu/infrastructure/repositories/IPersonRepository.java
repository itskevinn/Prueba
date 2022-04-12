package com.kevcode.PruebaEsprinBu.infrastructure.repositories;

import com.kevcode.PruebaEsprinBu.domain.bank.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPersonRepository extends JpaRepository<Person, Integer> {
}
