package com.hc.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HC on 2018/4/24.
 */
@Service
public class MsgService {

    public void sth1() {
        System.out.println("--------sth1 start--------");
        for (int i = 0; i < 4; i++) {
            System.out.println("***************** " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("--------sth1 end--------");
    }

    @Async
    public void sth2() {
        System.out.println("--------sth2 start--------");
        for (int i = 0; i < 4; i++) {
            System.out.println("***************** " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("--------sth2 end--------");
    }

}