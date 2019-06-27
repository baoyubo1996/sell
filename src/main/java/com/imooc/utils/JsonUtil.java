package com.imooc.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/**
 * @ClassName JsonUtil
 * @Description TODO
 * @Auther bao_ybo
 * @Date 2019/6/27 21:45
 * @Version 1.0
 **/
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
