package com.apigateway.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("apiabc")
@RestController
public class ApiGatewayController {

    @GetMapping
    public String getAPIGateway()
    {
        return "This is api gateway";
    }
}
