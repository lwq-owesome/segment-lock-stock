package pers.hong.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.hong.project.service.ProductStockService;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootSeedprojectApplicationTests {

    @Resource
    private ProductStockService productStockService;

    @Test
    public void contextLoads() {
        productStockService.reduceProductStock(1,1000);
    }

}
