package com.wamoev.hibernatediving.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "androids")
public class Android {
    @Id
    private Integer id;

    @ManyToOne
    private Name name;

    @OneToOne(mappedBy = "android")
    private Head head;

    @ManyToMany
    @JoinTable(name = "androids_groups", inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<Group> groups;

    public Integer getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Head getHead() {
        return head;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }
}
