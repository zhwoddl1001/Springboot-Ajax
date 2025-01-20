package com.kh.AjaxSpringProject.service;

import com.kh.AjaxSpringProject.dto.Cafe;
import com.kh.AjaxSpringProject.mapper.CafeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeServiceImpl implements CafeService {
    @Autowired
    private CafeMapper cafeMapper;


    @Override
    public List<Cafe> getAllCafe() {
        return cafeMapper.getAllCafe();
    }

    @Override
    public Cafe getCafeId(int id) {
        return cafeMapper.getCafeId(id);
    }


}
