package com.kh.AjaxSpringProject.mapper;

import com.kh.AjaxSpringProject.dto.Cafe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CafeMapper {
    List<Cafe> getAllCafes();
}
