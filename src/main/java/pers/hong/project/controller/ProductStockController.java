package pers.hong.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.hong.project.common.Result;
import pers.hong.project.common.ResultGenerator;
import pers.hong.project.service.ProductStockService;

import javax.annotation.Resource;

/**
 * Created by awesome on 2019/06/05.
 */
@RestController
@RequestMapping("/product/stock/")
public class ProductStockController {
    @Resource
    private ProductStockService productStockService;

    @PostMapping("reduce")
    public Result reduceProductStock() {
        productStockService.reduceProductStock(1,100);
        return ResultGenerator.genSuccessResult();
    }


}