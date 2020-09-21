package com.kta.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kta.entity.Work;

@Repository
public interface WorkRepository extends JpaRepository<Work, Integer>{

    public Page<Work> findAllByOrderById(Pageable pageable);
}
