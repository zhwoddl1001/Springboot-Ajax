package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.dto.Cafe;
import com.kh.AjaxSpringProject.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringController {
    @Autowired
    private CafeService cafeService;

    @GetMapping("/api/cafes")
    public List<Cafe> getCafes() {
        List<Cafe> cafe = cafeService.getAllCafes();
        return cafe;
    }
}
