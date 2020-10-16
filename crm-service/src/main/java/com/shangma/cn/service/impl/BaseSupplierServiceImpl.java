package com.shangma.cn.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shangma.cn.entity.BaseSupplier;
import com.shangma.cn.mapper.BaseSupplierMapper;
import com.shangma.cn.service.IBaseSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 辉哥真球帅
 * @since 2020-10-16
 */
@Service
@Transactional
public class BaseSupplierServiceImpl implements IBaseSupplierService {


    @Autowired
    private BaseSupplierMapper baseSupplierMapper;

    @Override
    public List<BaseSupplier> findAll() {
        return baseSupplierMapper.selectList(null);
    }

    @Override
    public IPage<BaseSupplier> pageList(IPage<BaseSupplier> page) {
        return baseSupplierMapper.selectPage(page,null);
    }

    @Override
    public BaseSupplier findById(Serializable id) {
        return baseSupplierMapper.selectById(id);
    }

    @Override
    public void add(BaseSupplier entity) {
        baseSupplierMapper.insert(entity);
    }

    @Override
    public void update(BaseSupplier entity) {
        baseSupplierMapper.updateById(entity);
    }

    @Override
    public void deleleById(Serializable id) {
        baseSupplierMapper.deleteById(id);
    }
}
