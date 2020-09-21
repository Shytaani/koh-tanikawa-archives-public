package com.kta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kta.config.AppConfig;
import com.kta.dto.WorkDto;
import com.kta.repository.WorkRepository;

@Service
public class WorkService {

    @Autowired
    private WorkRepository repository;

    @Autowired
    private AppConfig config;

    public Page<WorkDto> list(Pageable pageable) {
        return repository.findAllByOrderById(pageable).map(work -> new WorkDto(work, config.getImagePath()));
    }
}
