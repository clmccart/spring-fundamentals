package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl2 implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl2() {
        System.out.println("No arg constructor");
    }

    public SpeakerServiceImpl2(SpeakerRepository repository) {
        this.repository = repository;
        System.out.println(repository);

    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
        System.out.println("repository setter");
        System.out.println("repository setter");
    }
}
