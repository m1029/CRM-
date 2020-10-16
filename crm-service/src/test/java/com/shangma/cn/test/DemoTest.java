package com.shangma.cn.test;




import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shangma.cn.entity.BaseCategory;
import com.shangma.cn.service.IBaseCategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext-mapper.xml","classpath:applicationContext-service.xml"})
public class DemoTest {


    /*
    *
    * git提交项目 需要配置忽略文件
    *
    * 提交时我们只需要提交有用的代码 想idea  xxx.iml  target    不需要提交
    *
    * 设置忽略文件的方式
    *
    * .gitignore
    *       .idea
            *.iml
            *
            *
       idea也可以设置忽略文件
            第一种方式 filtType
            第二种方式 fileIgore
            第三种方式 .ignore插件
    *
    *
    *
    *
    *
    *
    *
    * */



//    @Autowired
//    private BaseCategoryMappper baseCategoryMappper;


    @Autowired
    private IBaseCategoryService iBaseCategoryService;




    @Test
    public void doTest(){
        IPage<BaseCategory> page = new Page<>(1,3);
        IPage<BaseCategory> baseCategoryIPage = iBaseCategoryService.pageList(page);
//        baseCategoryIPage.getRecords()

        System.out.println(page==baseCategoryIPage);
////        System.out.println(baseCategoryMappper.selectList(null));
//
//        Category category  = new Category();
//        category.setHuigename("bbbbb");
//        category.setpId(3);
//        category.setAddress("xxxxx");
//
//        baseCategoryMappper.insert(category);

    }
}
