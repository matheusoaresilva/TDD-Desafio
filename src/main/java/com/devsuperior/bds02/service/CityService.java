package com.devsuperior.bds02.service;

import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {

    @Autowired
    CityRepository repository;

    public List<CityDTO> findAll(){
        List<City> list = repository.findAll(Sort.by("name"));
        return list.stream().map(x -> new CityDTO(x)).collect(Collectors.toList());
    }
}
