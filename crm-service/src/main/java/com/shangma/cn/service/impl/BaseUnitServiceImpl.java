package com.shangma.cn.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shangma.cn.entity.BaseUnit;
import com.shangma.cn.mapper.BaseUnitMapper;
import com.shangma.cn.service.IBaseUnitService;
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
 *
 * @author 辉哥真球帅
 * @since 2020-10-16
 */
@Service
@Transactional
public class BaseUnitServiceImpl implements IBaseUnitService {

    @Autowired
    private BaseUnitMapper baseUnitMapper;

    @Override
    public List<BaseUnit> findAll() {
        return baseUnitMapper.selectList(null);
    }

    @Override
    public IPage<BaseUnit> pageList(IPage<BaseUnit> page) {
        return baseUnitMapper.selectPage(page, null);
    }

    @Override
    public BaseUnit findById(Serializable id) {
        return baseUnitMapper.selectById(id);
    }

    @Override
    public void add(BaseUnit entity) {
        baseUnitMapper.insert(entity);
    }

    @Override
    public void update(BaseUnit entity) {
        baseUnitMapper.updateById(entity);
    }

    @Override
    public void deleleById(Serializable id) {
        baseUnitMapper.deleteById(id);
    }
}
