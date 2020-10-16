package com.shangma.cn.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shangma.cn.entity.BaseGood;
import com.shangma.cn.mapper.BaseGoodMapper;
import com.shangma.cn.service.IBaseGoodService;
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
public class BaseGoodServiceImpl implements IBaseGoodService {

    @Autowired
    private BaseGoodMapper baseGoodMapper;

    @Override
    public List<BaseGood> findAll() {
        return baseGoodMapper.selectList(null);
    }

    @Override
    public IPage<BaseGood> pageList(IPage<BaseGood> page) {
        IPage<BaseGood> page1 = baseGoodMapper.selectPage(page, null);
        return page1;
    }

    @Override
    public BaseGood findById(Serializable id) {
        return baseGoodMapper.selectById(id);
    }

    @Override
    public void add(BaseGood entity) {
        baseGoodMapper.insert(entity);
    }

    @Override
    public void update(BaseGood entity) {
        baseGoodMapper.updateById(entity);
    }

    @Override
    public void deleleById(Serializable id) {
        baseGoodMapper.deleteById(id);
    }
}
