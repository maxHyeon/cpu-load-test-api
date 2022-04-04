package com.example.testapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/echo")
public class Apiv2ServiceController {

    @GetMapping(value = "/{string}")
    @ResponseBody
    public String echo(@PathVariable("string") String inputString) throws InterruptedException {
        return "This is V2 echo : "+inputString;
    }
}
