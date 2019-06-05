package pers.hong.project.service;
import pers.hong.project.entity.ProductStock;
import pers.hong.project.core.Service;


/**
 * @author liwenqiang
 * Created by awesome on 2019/06/05.
 */
public interface ProductStockService extends Service<ProductStock> {

    /**
     * 扣减库存
     * @param productId
     * @param productStock
     */
    void  reduceProductStock (Integer productId,Integer productStock);

    /**
     * 扣减segment库存
     * @param productId
     * @param productStock
     */
    void  reduceProductSegmentStock (Integer productId,Integer productStock,Integer segmentIdSeq);

    /**
     * 通过segmentid 获取 商品库存
     * @param productId
     * @param sgementId
     * @return
     */
    Integer getProductStockBySegment(Integer productId,Integer sgementId);

}