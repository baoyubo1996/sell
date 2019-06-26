package com.imooc.utils;

import com.imooc.VO.ResultVO;
/**
 * @ClassName ResultVOUtil
 * @Description TODO
 * @Auther bao_ybo
 * @Date 2019/6/25 15:00
 * @Version 1.0
 **/
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}

