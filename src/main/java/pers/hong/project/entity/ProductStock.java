package pers.hong.project.entity;

import javax.persistence.*;

/**
 *商品库存
 */
@Table(name = "product_stock")
public class ProductStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "stock_01")
    private Integer stock01;

    @Column(name = "stock_02")
    private Integer stock02;

    @Column(name = "stock_03")
    private Integer stock03;

    @Column(name = "stock_04")
    private Integer stock04;

    @Column(name = "stock_05")
    private Integer stock05;

    @Column(name = "stock_06")
    private Integer stock06;

    @Column(name = "stock_07")
    private Integer stock07;

    @Column(name = "stock_08")
    private Integer stock08;

    @Column(name = "stock_09")
    private Integer stock09;

    @Column(name = "stock_10")
    private Integer stock10;

    @Column(name = "stock_segment")
    private Integer stockSegment;

    public Integer getStockSegment() {
        return stockSegment;
    }

    public void setStockSegment(Integer stockSegment) {
        this.stockSegment = stockSegment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStock01() {
        return stock01;
    }

    public void setStock01(Integer stock01) {
        this.stock01 = stock01;
    }

    public Integer getStock02() {
        return stock02;
    }

    public void setStock02(Integer stock02) {
        this.stock02 = stock02;
    }

    public Integer getStock03() {
        return stock03;
    }

    public void setStock03(Integer stock03) {
        this.stock03 = stock03;
    }

    public Integer getStock04() {
        return stock04;
    }

    public void setStock04(Integer stock04) {
        this.stock04 = stock04;
    }

    public Integer getStock05() {
        return stock05;
    }

    public void setStock05(Integer stock05) {
        this.stock05 = stock05;
    }

    public Integer getStock06() {
        return stock06;
    }

    public void setStock06(Integer stock06) {
        this.stock06 = stock06;
    }

    public Integer getStock07() {
        return stock07;
    }

    public void setStock07(Integer stock07) {
        this.stock07 = stock07;
    }

    public Integer getStock08() {
        return stock08;
    }

    public void setStock08(Integer stock08) {
        this.stock08 = stock08;
    }

    public Integer getStock09() {
        return stock09;
    }

    public void setStock09(Integer stock09) {
        this.stock09 = stock09;
    }

    public Integer getStock10() {
        return stock10;
    }

    public void setStock10(Integer stock10) {
        this.stock10 = stock10;
    }
}