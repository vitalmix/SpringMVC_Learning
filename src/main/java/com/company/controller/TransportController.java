package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TransportController {

    @RequestMapping("/")
    public String showTransportPage() {
        return "transport-menu";
    }
}
