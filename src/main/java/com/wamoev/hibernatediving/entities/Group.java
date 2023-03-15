package com.wamoev.hibernatediving.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
