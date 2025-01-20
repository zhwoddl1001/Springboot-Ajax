package com.kh.AjaxSpringProject.service;

import com.kh.AjaxSpringProject.dto.Cafe;

import java.util.List;


public interface CafeService {
    List<Cafe> getAllCafe();

    Cafe getCafeId(int id);
}
