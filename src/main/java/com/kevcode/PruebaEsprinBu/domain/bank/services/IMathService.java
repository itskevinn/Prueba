package com.kevcode.PruebaEsprinBu.domain.bank.services;

import com.kevcode.PruebaEsprinBu.domain.bank.exceptions.InvalidNumberValueException;

public interface IMathService {
    Long sum(int a, int b) throws InvalidNumberValueException;

    Long sub(int a, int b) throws InvalidNumberValueException;
}
