package com.shangma.cn.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shangma.cn.entity.BaseSupplier;
import com.shangma.cn.entity.BaseUnit;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 辉哥真球帅
 * @since 2020-10-16
 */
public interface IBaseUnitService  {


    /**
     * 查询所有
     * @return
     */
    List<BaseUnit> findAll();


    /**
     * 分页查询

     * @return
     */

    IPage<BaseUnit> pageList(IPage<BaseUnit> page) ;

    /**
     * 通过id查询
     * @param id 表示数据库中的主键
     * @return
     */
    BaseUnit findById(Serializable id);


    /**
     * 添加功能
     * @param entity 实体类对象
     */
    void add(BaseUnit entity);


    /**
     * 修改功能
     * @param entity
     */
    void  update(BaseUnit entity);

    /**
     * 通过id删除 
     * @param id
     */
    void deleleById(Serializable id);

}