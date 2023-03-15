package com.wamoev.hibernatediving.resources;

import com.wamoev.hibernatediving.entities.Android;
import com.wamoev.hibernatediving.repositories.AndroidRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/androids")
public class AndroidResource {

    private final AndroidRepository androidRepository;

    public AndroidResource(AndroidRepository androidRepository) {
        this.androidRepository = androidRepository;
    }

    @GetMapping("/{id}")
    public Android getById(@PathVariable Integer id) {
        return androidRepository.findById(id).get();
    }
}
