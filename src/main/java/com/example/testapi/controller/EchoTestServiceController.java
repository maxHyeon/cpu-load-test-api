package com.example.testapi.controller;

import com.example.testapi.service.CpuTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/api/v1/echo")
public class EchoTestServiceController {

    @GetMapping(value = "/{string}")
    @ResponseBody
    public String echo(@PathVariable("string") String inputString) throws InterruptedException {
        return inputString;
    }
}
