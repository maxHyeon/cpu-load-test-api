package com.example.testapi.controller;

import com.example.testapi.SleepTime;
import com.example.testapi.service.TimeoutTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/v1/hc")
public class HCServiceController {
    @Autowired
    private TimeoutTestService timeoutTestService;
    @Autowired
    public SleepTime sleepTime;
    @GetMapping
//    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @ResponseBody
    public String hc() throws InterruptedException {
        Thread.sleep(sleepTime.sleeptime);
        return "good";
    }
}
