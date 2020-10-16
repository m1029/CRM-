package com.shangma.cn.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shangma.cn.entity.BaseCategory;
import com.shangma.cn.http.AxiosResult;
import com.shangma.cn.http.PageResult;
import com.shangma.cn.service.IBaseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 辉哥真球帅
 * @since 2020-10-16
 */
@RestController
@RequestMapping("category")
public class BaseCategoryController {


    @Autowired
    private IBaseCategoryService iBaseCategoryService;


    /**
     * 查询所有
     *
     * @return
     */
    @GetMapping
    public AxiosResult findAll() {
        return AxiosResult.success(iBaseCategoryService.findAll());
    }


    @GetMapping("page")
    public AxiosResult pageList(@RequestParam(defaultValue = "1") int currentPage
                                ,@RequestParam(defaultValue = "2") int pageSize) {
        IPage<BaseCategory> page = new Page<>(currentPage, pageSize);
        IPage<BaseCategory> page1 = iBaseCategoryService.pageList(page);
        return AxiosResult.success(PageResult.instance(page1.getRecords(), page1.getTotal()));
    }


    @PostMapping
    public AxiosResult add(@RequestBody BaseCategory BaseCategory) {
        iBaseCategoryService.add(BaseCategory);
        return AxiosResult.success();
    }


    @PutMapping
    public AxiosResult update(@RequestBody BaseCategory BaseCategory) {
        iBaseCategoryService.update(BaseCategory);
        return AxiosResult.success();
    }

    @GetMapping("{id}")
    public AxiosResult findById(@PathVariable Serializable id) {
        return AxiosResult.success(iBaseCategoryService.findById(id));
    }


    @DeleteMapping("{id}")
    public AxiosResult deleteById(@PathVariable Serializable id) {
        iBaseCategoryService.deleleById(id);
        return AxiosResult.success();
    }

}
