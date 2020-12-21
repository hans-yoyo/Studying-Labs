package io.hans.coder.redis;

import io.hans.coder.entity.SiteEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @描述 TODO 类描述
 * @author Hans
 * @created 2020/12/19 15:58
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTemplateTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testSite(){
        SiteEntity site = SiteEntity.builder()
                .siteName("无锡旺庄站")
                .siteCode("WXGK320214000001")
                .build();
        redisTemplate.opsForValue().set("site", site);
        redisTemplate.opsForValue().set(site.getSiteCode(), site.getSiteName());
        System.out.println(redisTemplate.opsForValue().get(site.getSiteCode()));
    }

}
