package io.hans.coder.controller;

import io.hans.coder.model.City;
import io.hans.coder.service.impl.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @描述 TODO 类描述
 * @author Hans
 * @created 2021/01/23 16:42
 */
@RestController
@RequestMapping("/api/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("cities")
    public List<City> findAll() {
        return cityService.findAll();
    }

    @RequestMapping("cities/{cityId}")
    public City findById(@PathVariable("cityId") long cityId) {
        return cityService.findById(cityId);
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<String> noCityFound(EmptyResultDataAccessException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No City found");
    }


}
