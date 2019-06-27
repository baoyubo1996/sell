package com.imooc.utils;

/**
 * @ClassName MathUtil
 * @Description TODO
 * @Auther bao_ybo
 * @Date 2019/6/27 21:45
 * @Version 1.0
 **/
public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;

    /**
     * 比较2个金额是否相等
     * @param d1
     * @param d2
     * @return
     */
    public static Boolean equals(Double d1, Double d2) {
        Double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE) {
            return true;
        }else {
            return false;
        }
    }
}
