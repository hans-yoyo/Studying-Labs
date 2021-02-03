package io.hans.coder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootBasisApplicationTests {

    @Autowired
    private SiteMapper siteMapper;

    @Test
    void contextLoads() {
        List<SiteEntity> list = siteMapper.selectList(null);
        list.forEach(System.out::println);
    }

}
