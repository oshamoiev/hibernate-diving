package com.wamoev.hibernatediving.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "names")
public class Name {
    @Id
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
