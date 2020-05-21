package com.testcase;

import com.testcase.BaseTest;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class BuyTest extends BaseTest {
    @Test
    public void buy (){
        if(dataMap.get("login").equals("登录成功")){
            System.out.println("买买买");
        }else{
            System.out.println("傻逼");
        }
    }
}
