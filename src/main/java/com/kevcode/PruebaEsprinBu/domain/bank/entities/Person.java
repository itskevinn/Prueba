package com.kevcode.PruebaEsprinBu.domain.bank.entities;

import com.kevcode.PruebaEsprinBu.domain.shared.EntityBase;

import javax.persistence.*;

@Entity
public class Person extends EntityBase {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
