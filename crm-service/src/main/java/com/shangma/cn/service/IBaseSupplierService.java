package com.shangma.cn.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shangma.cn.entity.BaseGood;
import com.shangma.cn.entity.BaseSupplier;
import com.shangma.cn.entity.BaseSupplier;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 辉哥真球帅
 * @since 2020-10-16
 */
public interface IBaseSupplierService {

    /**
     * 查询所有
     * @return
     */
    List<BaseSupplier> findAll();


    /**
     * 分页查询
     * @return
     */

     IPage<BaseSupplier> pageList(IPage<BaseSupplier> page) ;

    /**
     * 通过id查询
     * @param id 表示数据库中的主键
     * @return
     */
    BaseSupplier findById(Serializable id);


    /**
     * 添加功能
     * @param entity 实体类对象
     */
    void add(BaseSupplier entity);


    /**
     * 修改功能
     * @param entity
     */
    void  update(BaseSupplier entity);

    /**
     * 通过id删除 
     * @param id
     */
    void deleleById(Serializable id);


}
