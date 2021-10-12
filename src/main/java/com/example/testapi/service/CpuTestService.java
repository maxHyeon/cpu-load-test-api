package com.example.testapi.service;

import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Service;

@Service
public class CpuTestService {

    public String load(long t) throws InterruptedException {
        double i = 1.2;

        while(t > 0) {
            i = Math.tan(Math.sin(Math.cos(i)));
            Thread.sleep(100);
            t--;
        }

        //double a = 2.0;

        return "the result is :" + i;
    }
}
