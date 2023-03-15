package com.wamoev.hibernatediving.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "androids")
public class Android {
    @Id
    private Integer id;

    @ManyToOne
    private Name name;

    @OneToOne
    private Head head;

    public Integer getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Head getHead() {
        return head;
    }
}
