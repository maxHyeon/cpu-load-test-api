package com.example.testapi.service;

import org.springframework.stereotype.Service;

@Service
public class HCService {

    public String stop(long ms) throws InterruptedException {

        Thread.sleep(ms);

        return "Stopped time:" + ms + "ms";
    }
}
