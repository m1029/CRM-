package com.shangma.cn.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shangma.cn.entity.BaseCustomer;
import com.shangma.cn.mapper.BaseCustomerMapper;
import com.shangma.cn.service.IBaseCustomerService;
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
public class BaseCustomerServiceImpl implements IBaseCustomerService {


    @Autowired
    private BaseCustomerMapper baseCustomerMapper;

    @Override
    public List<BaseCustomer> findAll() {
        return baseCustomerMapper.selectList(null);
    }

    @Override
    public IPage<BaseCustomer> pageList(IPage<BaseCustomer> page) {
        return baseCustomerMapper.selectPage(page, null);
    }

    @Override
    public BaseCustomer findById(Serializable id) {
        return baseCustomerMapper.selectById(id);
    }

    @Override
    public void add(BaseCustomer entity) {
        baseCustomerMapper.insert(entity);
    }

    @Override
    public void update(BaseCustomer entity) {
        baseCustomerMapper.updateById(entity);
    }

    @Override
    public void deleleById(Serializable id) {
        baseCustomerMapper.deleteById(id);
    }
}
