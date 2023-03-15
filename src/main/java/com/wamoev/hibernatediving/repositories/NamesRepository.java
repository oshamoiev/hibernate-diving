package com.wamoev.hibernatediving.repositories;

import com.wamoev.hibernatediving.entities.Name;
import org.springframework.data.repository.CrudRepository;

public interface NamesRepository extends CrudRepository<Name, Long> {
}
