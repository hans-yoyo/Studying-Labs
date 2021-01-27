package io.hans.coder.service.impl;

import io.hans.coder.model.City;
import io.hans.coder.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @描述 TODO 类描述
 * @author Hans
 * @created 2021/01/23 16:37
 */
@Service
public class CityService implements ICityService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<City> findAll() {
        String sql = "SELECT * FROM cities";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(City.class));
    }

    @Override
    public City findById(Long id) {
        String sql = "SELECT * FROM cities WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(City.class));
    }
}
