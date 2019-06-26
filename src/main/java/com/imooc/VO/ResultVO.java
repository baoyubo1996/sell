package com.imooc.VO;

import lombok.Data;
/**
 * @Author bao_ybo
 * @Description //TODO http请求返回的最外层对象
 * @Date 14:54 2019/6/25
 * @Param
 * @return
 **/
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
