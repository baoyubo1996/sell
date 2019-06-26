package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * @ClassName EnumUtil
 * @Description TODO
 * @Auther bao_ybo
 * @Date 2019/6/25 10:30
 * @Version 1.0
 **/
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
