package com.wamoev.hibernatediving.repositories;

import com.wamoev.hibernatediving.entities.Android;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface AndroidRepository extends CrudRepository<Android, Integer> {
}
