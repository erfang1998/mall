package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * 品牌操作service类接口
 * Create by zy on 2020/1/2
 **/
public interface PmsBrandService {

    List<PmsBrand> listAllBrand(); //列举全部

    int createBrand(PmsBrand pmsBrand);  //创建

    int updateBrand(long id, PmsBrand pmsBrand);  //更新

    int deleteBrand(long id);  //删除

    List<PmsBrand> listBrand(int pageNum, int pageSize); //品牌分页

    PmsBrand getBrand(long id);  //查看详情

}
