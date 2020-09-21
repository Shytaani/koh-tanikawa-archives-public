package com.kta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kta.dto.WorkDto;
import com.kta.service.WorkService;

@Controller
public class KtaController {

    @Autowired
    private WorkService service;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:/archives";
    }

    @RequestMapping(path = "/archives", method = RequestMethod.GET)
    public ModelAndView archives(@ModelAttribute WorkForm form, @PageableDefault(size = 8) Pageable pageable) {
        Page<WorkDto> page = service.list(pageable);
        form.setPagenation(page);
        form.setWorkList(page.getContent());
        return new ModelAndView("archives");
    }
}
