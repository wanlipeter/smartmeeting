package com.wanli.smartmeeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HomeController
 * @Description: TODO
 * @Author: WanLi
 * @Date: 2020/8/3 下午4:01
 */
@Controller
public class TestController {

    /**
     * @Author WanLi
     * @Description //TODO 
     * @Date 6:36 下午 2021/5/31
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("/ok")
    @ResponseBody
    public String ok() {
        System.out.println ( "ok" );
        return "ok";
    }

}
