package com.wamoev.hibernatediving.resources;

import com.wamoev.hibernatediving.entities.Name;
import com.wamoev.hibernatediving.repositories.NamesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/names")
public class NamesResource {

    private final NamesRepository namesRepository;

    public NamesResource(NamesRepository namesRepository) {
        this.namesRepository = namesRepository;
    }

    @GetMapping
    public Iterable<Name> getAll() {
        return namesRepository.findAll();
    }
}
