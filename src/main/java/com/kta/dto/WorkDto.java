package com.kta.dto;

import com.kta.entity.Work;

import lombok.Data;

@Data
public class WorkDto {

    private int id;

    private String name;

    private String imagePath;

    private String yearCreated;

    public WorkDto(Work entity, String imagePath) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.imagePath = imagePath + entity.getImageFileName();
        this.yearCreated = entity.getYearCreated();
    }
}
