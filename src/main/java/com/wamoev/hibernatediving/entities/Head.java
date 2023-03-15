package com.wamoev.hibernatediving.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "heads")
public class Head {

    @Id
    private Integer id;

    private String description;

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
