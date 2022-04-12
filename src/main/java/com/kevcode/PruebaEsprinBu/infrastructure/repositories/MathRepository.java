package com.kevcode.PruebaEsprinBu.infrastructure.repositories;

import com.kevcode.PruebaEsprinBu.domain.bank.repositories.IMathRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MathRepository implements IMathRepository {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
