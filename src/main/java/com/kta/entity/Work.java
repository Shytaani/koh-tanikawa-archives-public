package com.kta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "work_id")
    private int id;

    @Column(length = 256)
    private String name;

    @Column(name = "image_file_name", nullable = false, length = 256)
    private String imageFileName;

    @Column(name = "year_created", length = 4)
    private String yearCreated;
}
