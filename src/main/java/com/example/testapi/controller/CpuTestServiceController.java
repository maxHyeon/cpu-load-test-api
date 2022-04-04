package com.example.testapi.controller;

import com.example.testapi.service.CpuTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/api/v1/cpu")
public class CpuTestServiceController {
    @Autowired
    private CpuTestService cpuTestService;

    @GetMapping(value = "/load")
    @ResponseBody
    public String load() throws Exception {
        //throw new Exception();
        return cpuTestService.load(ThreadLocalRandom.current().nextLong(5));
    }
}
