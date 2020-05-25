package com.hc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HC on 2018/4/24.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private MsgService msgService;

    @RequestMapping("/fun1")
    public void fun1() {
        System.out.println("--------fun1 start--------");
        msgService.sth1();
        System.out.println("--------fun1 end--------");
    }

    @RequestMapping("/fun2")
    public void fun2() {
        System.out.println("--------fun2 start--------");
        msgService.sth2();
        System.out.println("--------fun2 end--------");
    }

}
