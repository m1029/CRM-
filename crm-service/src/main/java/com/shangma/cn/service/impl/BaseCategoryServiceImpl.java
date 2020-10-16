package com.shangma.cn.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shangma.cn.entity.BaseCategory;
import com.shangma.cn.mapper.BaseCategoryMapper;
import com.shangma.cn.service.IBaseCategoryService;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 辉哥真球帅
 * @since 2020-10-16
 */
@Service
@Transactional

public class BaseCategoryServiceImpl implements IBaseCategoryService {

    @Autowired
    private BaseCategoryMapper baseCategoryMapper;

    @Override
    public List<BaseCategory> findAll() {
        return baseCategoryMapper.selectList(null);
    }

    @Override
    public IPage<BaseCategory> pageList(IPage<BaseCategory> page) {
        return baseCategoryMapper.selectPage(page, null);
    }

    @Override
    public BaseCategory findById(Serializable id) {
        return baseCategoryMapper.selectById(id);
    }

    @Override
    public void add(BaseCategory entity) {
        baseCategoryMapper.insert(entity);
    }

    @Override
    public void update(BaseCategory entity) {
        baseCategoryMapper.updateById(entity);
    }

    @Override
    public void deleleById(Serializable id) {
        baseCategoryMapper.deleteById(id);
    }
}
