package com.shangma.cn.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shangma.cn.entity.BaseUnit;
import com.shangma.cn.http.AxiosResult;
import com.shangma.cn.http.PageResult;
import com.shangma.cn.service.IBaseUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 辉哥真球帅
 * @since 2020-10-16
 */
@RestController
@RequestMapping("unit")
public class BaseUnitController {

    @Autowired
    private IBaseUnitService iBaseUnitService;


    /**
     * 查询所有
     *
     * @return
     */
    @GetMapping
    public AxiosResult findAll() {
        return AxiosResult.success(iBaseUnitService.findAll());
    }


    @GetMapping("page")
    public AxiosResult pageList(@RequestParam(defaultValue = "1") int currentPage
            ,@RequestParam(defaultValue = "2") int pageSize) {
        IPage<BaseUnit> page = new Page<>(currentPage, pageSize);
        IPage<BaseUnit> page1 = iBaseUnitService.pageList(page);
        return AxiosResult.success(PageResult.instance(page1.getRecords(), page1.getTotal()));
    }


    @PostMapping
    public AxiosResult add(@RequestBody BaseUnit BaseUnit) {
        iBaseUnitService.add(BaseUnit);
        return AxiosResult.success();
    }


    @PutMapping
    public AxiosResult update(@RequestBody BaseUnit BaseUnit) {
        iBaseUnitService.update(BaseUnit);
        return AxiosResult.success();
    }

    @GetMapping("{id}")
    public AxiosResult findById(@PathVariable Serializable id) {
        return AxiosResult.success(iBaseUnitService.findById(id));
    }


    @DeleteMapping("{id}")
    public AxiosResult deleteById(@PathVariable Serializable id) {
        iBaseUnitService.deleleById(id);
        return AxiosResult.success();
    }

}
