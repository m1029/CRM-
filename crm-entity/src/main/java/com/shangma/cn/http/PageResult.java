package com.shangma.cn.http;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PageResult {

    private Object records;
    private long total;


    public static PageResult instance(Object records, long total) {
        return new PageResult(records, total);
    }


}
