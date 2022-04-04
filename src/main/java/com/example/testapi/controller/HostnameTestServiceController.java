package com.example.testapi.controller;

import com.example.testapi.service.CpuTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;

@RestController
@RequestMapping("/api/v1/hostname")
public class HostnameTestServiceController {
    @GetMapping()
    @ResponseBody
    public String getHostname() throws InterruptedException, UnknownHostException {
        return java.net.InetAddress.getLocalHost().getHostName();
    }
}
