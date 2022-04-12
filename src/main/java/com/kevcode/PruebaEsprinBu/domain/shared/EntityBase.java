package com.kevcode.PruebaEsprinBu.domain.shared;

import javax.persistence.*;

@MappedSuperclass
public class EntityBase {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
