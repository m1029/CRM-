package com.shangma.cn.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shangma.cn.entity.BaseGood;
import com.shangma.cn.http.AxiosResult;
import com.shangma.cn.http.PageResult;
import com.shangma.cn.service.IBaseCategoryService;
import com.shangma.cn.service.IBaseGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 辉哥真球帅
 * @since 2020-10-16
 */
@RestController
@RequestMapping("good")
public class BaseGoodController {


    @Autowired
    private IBaseGoodService iBaseGoodService;


    /**
     * 查询所有
     *
     * @return
     */
    @GetMapping
    public AxiosResult findAll() {
        return AxiosResult.success(iBaseGoodService.findAll());
    }


    @GetMapping("page")
    public AxiosResult pageList(@RequestParam(defaultValue = "1") int currentPage
            ,@RequestParam(defaultValue = "2") int pageSize){
        IPage<BaseGood> page = new Page<>(currentPage, pageSize);
        IPage<BaseGood> page1 = iBaseGoodService.pageList(page);
        return AxiosResult.success(PageResult.instance(page1.getRecords(), page1.getTotal()));
    }


    @PostMapping
    public AxiosResult add(@RequestBody BaseGood baseGood) {
        iBaseGoodService.add(baseGood);
        return AxiosResult.success();
    }


    @PutMapping
    public AxiosResult update(@RequestBody BaseGood baseGood) {
        iBaseGoodService.update(baseGood);
        return AxiosResult.success();
    }

    @GetMapping("{id}")
    public AxiosResult findById(@PathVariable Serializable id) {
        return AxiosResult.success(iBaseGoodService.findById(id));
    }


    @DeleteMapping("{id}")
    public AxiosResult deleteById(@PathVariable Serializable id) {
        iBaseGoodService.deleleById(id);
        return AxiosResult.success();
    }


}
