package com.example.testapi.controller;

import com.example.testapi.SleepTime;
import com.example.testapi.service.TimeoutTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping(value="/api/v1")
public class TimeoutTestServiceController {
    @Autowired
    private TimeoutTestService timeoutTestService;
    @Autowired
    public SleepTime sleepTime;

    @GetMapping(value = "/timeout/{msec}")
    @ResponseBody
    public String timeout(@PathVariable("msec") long stopMilliSec) throws InterruptedException {
        sleepTime.sleeptime = stopMilliSec;
        return timeoutTestService.stop(sleepTime.sleeptime);
    }
}
