package com.shangma.cn.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shangma.cn.entity.BaseGood;

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
public interface IBaseGoodService {


    /**
     * 查询所有
     * @return
     */
    List<BaseGood> findAll();


    /**
     * 分页查询
     * @return
     */

    IPage<BaseGood> pageList(IPage<BaseGood> page) ;
    /**
     * 通过id查询
     * @param id 表示数据库中的主键
     * @return
     */
    BaseGood findById(Serializable id);


    /**
     * 添加功能
     * @param entity 实体类对象
     */
    void add(BaseGood entity);


    /**
     * 修改功能
     * @param entity
     */
    void  update(BaseGood entity);

    /**
     * 通过id删除
     * @param id
     */
    void deleleById(Serializable id);




}
