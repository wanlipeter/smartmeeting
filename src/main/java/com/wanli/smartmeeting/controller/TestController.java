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
     * 应用状态检测
     */
    @RequestMapping("/ok")
    @ResponseBody
    public String ok() {
        System.out.println ( "ok" );
        return "ok";
    }

}
