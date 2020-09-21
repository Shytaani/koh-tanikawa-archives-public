package com.kta.controller;

import java.util.List;

import org.springframework.data.domain.Page;

import com.kta.dto.WorkDto;

import lombok.Data;

@Data
public class WorkForm {

    private Page<WorkDto> pagenation;

    private List<WorkDto> workList;
}
