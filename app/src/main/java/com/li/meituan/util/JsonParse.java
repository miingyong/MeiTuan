package com.li.meituan.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.li.meituan.bean.ShopBean;

import java.lang.reflect.Type;
import java.util.List;

public class JsonParse {
    private static JsonParse instance;
    private JsonParse(){}
    public static JsonParse getInstance(){
        if (instance == null) {
            instance = new JsonParse();
        }
        return instance;
    }
    public List<ShopBean> getShopList(String json){
       Gson gson=new Gson();
       //使用TypeToken的匿名子类对象，并调用后者方法
        Type listType = new TypeToken<List<ShopBean>>(){}.getType();
        List<ShopBean> shopList = gson.fromJson(json, listType);
        return shopList;
    }
}
