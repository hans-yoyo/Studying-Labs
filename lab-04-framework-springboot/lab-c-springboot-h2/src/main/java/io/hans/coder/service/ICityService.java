package io.hans.coder.service;

import io.hans.coder.model.City;

import java.util.List;

/**
 * @描述 TODO 类描述
 * @author Hans
 * @created 2021/01/23 16:36
 */
public interface ICityService {

    List<City> findAll();

    City findById(Long id);

}
