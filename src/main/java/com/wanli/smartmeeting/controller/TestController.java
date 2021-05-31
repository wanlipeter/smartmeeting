package com.wanli.smartmeeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wanli
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
